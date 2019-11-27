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
public static int vetorDeVidas[]= new int[10];
public static TelaRefresh tela = new TelaRefresh();
public static Escritor escritor = new Escritor();
public static List<EscolhaVO> listaDeTiros = new ArrayList<EscolhaVO>();
public static Acoes acoes = new Acoes();
public static DadosVO dadosAtuais = new DadosVO();
//public static List<InformacaoVO> listaDeInformação = new ArrayList<InformacaoVO>();

    public static void main(String[] args) throws Exception {
        boolean faltaMatar=true;
        tela.instanciarMapa(mapa);
        tela.criarHud(mapa);
        mapa = tela.adicionarEmbarcacoes(escritor.lerTxtMapa(),mapa);
        while (faltaMatar) {
            gameplay();
        }
    }

    public static void gameplay(){
        tela.lerMapaEscrever(mapa);
        dadosAtuais.listaDeTiros=listaDeTiros;
        dadosAtuais.mapa=mapa;
        dadosAtuais.vetorDeVidas = vetorDeVidas;
        acoes.receberAcao(dadosAtuais);

    }


}