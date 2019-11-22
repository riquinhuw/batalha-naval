package app;


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

    public static void main(String[] args) throws Exception {
        tela.instanciarMapa(mapa);
        System.out.println("Teste de escrita Hellur!");
        System.out.println(mapa[0][1].letra="PAO");
        tela.criarHud(mapa);
        tela.lerMapaEscrever(mapa);

    }


}