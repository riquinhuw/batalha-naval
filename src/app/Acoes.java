package app;

import java.util.List;
import java.util.Scanner;

/**
 * Acoes Responsavel pelas ações dentro do jogo Posso criar um objeto novo, para
 * receber todas as informacoes atuais, talvez eu crie depois talvez.... O
 * importante é rodar
 * 
 * Criar um verificador se ele destruiu todos os barcos, recebendo o vetor de
 * vida
 */
public class Acoes {

    public static DadosVO receberAcao(DadosVO dadosAtuais) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Almirante, escolha a próxima coordenada para atirarmos!");// Colocar a Waifu falando aqui
        String digitado = scan.nextLine();
        EscolhaVO escolha = new EscolhaVO(digitado.substring(0, 1), digitado.substring(1));
        Util util = new Util();
        escolha.linha = String.valueOf(util.TranscreverHorizontal(escolha.linha));
        //System.out.println("digitou:"+escolha.coluna+" e tb "+escolha.linha);
        dadosAtuais = verificarOAlvo(escolha, dadosAtuais);// vai verificar se a localização já
                                                                                 // foi usada
        return dadosAtuais;
    }

    public static DadosVO verificarOAlvo(EscolhaVO escolha,DadosVO dadosAtuais) {// no outpu no App, se o input for diferente do mais novo da lista é pq ele não foi aceito
        //System.out.println("ENTROU EM VERIFICAR ALVO");
        boolean taNaLista = false;
        for (int i = 0; i < dadosAtuais.listaDeTiros.size(); i++) {
            if (dadosAtuais.listaDeTiros.get(i).coluna == escolha.coluna && dadosAtuais.listaDeTiros.get(i).linha == escolha.linha) {
                System.out.println("ta na lista de tiro");
                taNaLista=true;
                return dadosAtuais;// se tiver na lista ele já retorna a lista sem mudar nada.
            } else {// se não tiver ele deixa false
                //taNaLista = false;
                System.out.println("ta nao");
            }

        }
        if (!taNaLista) {// se ele não estiver na lista de tiro, é pq está valido para atirar
            atirar(escolha, dadosAtuais);
            dadosAtuais.listaDeTiros.add(escolha);
            System.out.println("Nao ta e atirou");
        }
        System.out.println("fim");
        return dadosAtuais;// arrumar o return para DadosVO dadosAtuais.
    }

    public static void atirar(EscolhaVO escolha,DadosVO dadosAtuais) {
        int linha = Integer.parseInt(escolha.linha);
        int coluna = Integer.parseInt(escolha.coluna);

        if (linha>0&&linha<11&&coluna>0&&coluna<11) {// se for coordenada valida ele atira
            if (dadosAtuais.mapa[linha][coluna].agua) {
                dadosAtuais.mapa[linha][coluna].letra="X";
                System.out.println("OH não, foi no mar");
            }

            if(dadosAtuais.mapa[linha][coluna].hud){
                System.out.println("Almirante, essa coordenada não faz parte do jogo");
            }
    
            if (!dadosAtuais.mapa[linha][coluna].agua && !dadosAtuais.mapa[linha][coluna].hud) {// se não for água e hud ele faz algo, se não já
                                                                        // pula
                if (Integer.parseInt(escolha.linha) == linha && Integer.parseInt(escolha.coluna) == coluna) {
                    dadosAtuais.mapa[linha][coluna].atingido = true;
                    dadosAtuais.vetorDeVidas[dadosAtuais.mapa[linha][coluna].posVetorVida] = dadosAtuais.vetorDeVidas[dadosAtuais.mapa[linha][coluna].posVetorVida] - 1;
                }
    
            }            
        }else{System.out.println("Coordenadas invalidas! por favor tente novamente");}//se não for valido ele nao faz nada

    }
}