package app;

import java.util.ArrayList;
import java.util.List;


/** 
* Membros:
* Carlos H
* Catarina M
* Rebeka R
* Vitor M
*
* 
* Classe principal, onde vai rodar tudo.
*/

/**
 * TO DO
 * FAZER UM IF MAR ALTERAR LETRA PARA X
 * 
 */

public class App {
public static EmbacacaoVO[][] mapa = new EmbacacaoVO[11][11];
public static int vetorDeVidas[]= new int[11];
public static TelaRefresh tela = new TelaRefresh();
public static Escritor escritor = new Escritor();
public static List<EscolhaVO> listaDeTiros = new ArrayList<EscolhaVO>();
public static Acoes acoes = new Acoes();
public static DadosVO dadosAtuais = new DadosVO();
public static Util util = new Util();
//public static List<InformacaoVO> listaDeInformação = new ArrayList<InformacaoVO>();

    public static void main(String[] args) throws Exception {
        boolean faltaMatar=true;
        Waifu waifu = new Waifu();
        tela.instanciarMapa(mapa);
        tela.criarHud(mapa);
        dadosAtuais.mapa=mapa;
        dadosAtuais.vetorDeVidas=vetorDeVidas;
        dadosAtuais = tela.adicionarEmbarcacoes(escritor.lerTxtMapa(),dadosAtuais);
        mapa = dadosAtuais.mapa;
        vetorDeVidas=dadosAtuais.vetorDeVidas;
        waifu.intro();
        waifu.falarBemVindo();
        while (faltaMatar) {
            //System.out.print("\033[H\033[2J");  // limpa tela ta bugado
            //System.out.flush(); //limpa tb
            //System.out.print("\033\143");
            gameplay();// ok né
            listaDeTiros= dadosAtuais.listaDeTiros;
            mapa = dadosAtuais.mapa; // tem 2 locais que atualizam o mapa, ver se vai dar conflito
            vetorDeVidas = dadosAtuais.vetorDeVidas;
            int verificarVetorDeVidas=0;
            for (int i = 0; i < vetorDeVidas.length; i++) {
                if (vetorDeVidas[i] != 0) {
                    //System.out.println(vetorDeVidas[i]);
                    verificarVetorDeVidas++; // se tiver algum vetor com vida ele vai dar ++
                }
            }

            if (verificarVetorDeVidas==0) {
                faltaMatar= false;
            }
        }
        System.out.println("YOU WIN ALMIRANTE KUN");// o certo seria garantir que ele só roda essa linha, se ele ganhar mesmo
        if (!faltaMatar) {// se o jogo acabou mesmo, ele vai dar o output
            escritor.criarTxtJogadas(listaDeTiros, mapa);
        }
    }

    public static DadosVO gameplay(){
        tela.lerMapaEscrever(mapa);
        dadosAtuais.listaDeTiros=listaDeTiros;
        dadosAtuais.mapa=mapa;
        dadosAtuais.vetorDeVidas = vetorDeVidas;
        dadosAtuais = acoes.receberAcao(dadosAtuais);
        return dadosAtuais;
    }


}