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
public static List<InformacaoVO> listaDeInformação = new ArrayList<InformacaoVO>();

    public static void main(String[] args) throws Exception {
        tela.instanciarMapa(mapa);
        System.out.println("Teste de escrita Hellur!");
        tela.criarHud(mapa);
        
        tela.lerMapaEscrever(mapa);
        listaDeInformação = escritor.lerTxtMapa();

    }


}