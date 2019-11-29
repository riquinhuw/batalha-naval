package app;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Escritor Função de escrever e ler o arquivo
 * Metodo baseado no codigo disponivel pelo Professor 
 */

public class Escritor {
    public Waifu waifu = new Waifu();
    public List<InformacaoVO> listaDeInformação = new ArrayList<InformacaoVO>();
    public Util util = new Util();
    public List<InformacaoVO> lerTxtMapa() {// colocar para receber uma string que vai vir do args

        try (Scanner arquivo = new Scanner(new FileReader("tabuleiro.txt"))) {// tentar nao por na pasta.
            while (arquivo.hasNext()) {
                String juntarTexto = arquivo.next();
                juntarTexto = juntarTexto + arquivo.next();
                juntarTexto = juntarTexto + arquivo.next();
                juntarTexto = juntarTexto + arquivo.next();
                InformacaoVO info = new InformacaoVO(juntarTexto);
                listaDeInformação.add(info);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return listaDeInformação;
    }

    public void criarTxtJogadas(List<EscolhaVO> jogadaList,EmbacacaoVO[][] mapa) {
        PrintWriter arquivo = null;
        int coluna=0;
        int linha =0;
        double totalDeTiros=0;
        double tirosNaAgua=0;
        double tirosAcertados=0;
        int tirosInvalidos=0;//não implementado, talvez saia no 2.0 do jogo
        int tirosRepetidos=0;// não implementando tb, quem sabe algum dia.

        try {
            FileWriter out = new FileWriter("relatorioDeGuerra.txt");
            arquivo = new PrintWriter(out);
            arquivo.println("Almirante, aqui está o relatorio da nossa batalha:\n\n");
            totalDeTiros= jogadaList.size();//salvar o total de tiros
            for (int i = 0; i < jogadaList.size(); i++) {
                coluna = Integer.parseInt(jogadaList.get(i).coluna);
                linha = Integer.parseInt(jogadaList.get(i).linha);
                if (mapa[linha][coluna].agua==true){// se for água
                    arquivo.println("Nº "+(i+1)+" - "+"Linha:"+util.DesTranscreverHorizontal(jogadaList.get(i).linha) +" Coluna:"+jogadaList.get(i).coluna+" - Acertou à água");
                    tirosNaAgua++;
                } else {
                    if (mapa[linha][coluna].hud) {// se for Hud
                        arquivo.println("Nº "+(i+1)+" - "+"Linha:"+util.DesTranscreverHorizontal(jogadaList.get(i).linha) +" Coluna:"+jogadaList.get(i).coluna+" - Atirou no HUD");
                        tirosInvalidos++;
                    } else {
                        tirosAcertados++;
                        switch (mapa[linha][coluna].letra) {// verifica o tipo de embarcação que é
                            case "S":
                            arquivo.println("Nº "+(i+1)+" - "+"Linha:"+util.DesTranscreverHorizontal(jogadaList.get(i).linha) +" Coluna:"+jogadaList.get(i).coluna+" - Acertou um Submarnino");
                                break;
                            case "D":
                            arquivo.println("Nº "+(i+1)+" - "+"Linha:"+util.DesTranscreverHorizontal(jogadaList.get(i).linha) +" Coluna:"+jogadaList.get(i).coluna+" - Acertou um Destroyer");
                                break;
                            case "C":
                            arquivo.println("Nº "+(i+1)+" - "+"Linha:"+util.DesTranscreverHorizontal(jogadaList.get(i).linha) +" Coluna:"+jogadaList.get(i).coluna+" - Acertou um Cruzador");
                                break;
                            case "P":
                            arquivo.println("Nº "+(i+1)+" - "+"Linha:"+util.DesTranscreverHorizontal(jogadaList.get(i).linha) +" Coluna:"+jogadaList.get(i).coluna+" - Acertou um Porta-Avião");
                                break;
                            default:
                                break;
                        }
                    }  
                }
                
                
            }
            // fazer as contas de % aqui
            arquivo.println("Almirante, segue o relatorio de precisão:\n\n");// criar um if no fim para alterar fala
            arquivo.println("Você fez "+totalDeTiros+" tiros no total");
            arquivo.println("Onde "+((tirosAcertados/totalDeTiros)*100)+"% acertaram uma embarcação");
            arquivo.println("Infelizmente "+((tirosNaAgua/totalDeTiros)*100)+"% foram errados");

            //INSIRA AQUI A FALA COM O IF DEPENDENTO DA PORCENTAGEM 

            if (((tirosAcertados/totalDeTiros)*100)>70) {
                waifu.falarAcertouMuito();
            }else{waifu.falarErrouDeMais();}
            System.out.println("\n");
            // colocar sobre os navios
            waifu.falarObrigadoPorJogar();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            arquivo.close();
        }
    }
}