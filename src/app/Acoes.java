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

    public static List<EscolhaVO> receberAcao(EmbacacaoVO[][] mapa, List<EscolhaVO> listaDeTiros, int[] vetorDeVidas) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Almirante, escolha a próxima coordenada para atirarmos!");// Colocar a Waifu falando aqui
        String digitado = scan.nextLine();
        EscolhaVO escolha = new EscolhaVO(digitado.substring(0, 1), digitado.substring(1, 2));
        Util util = new Util();
        escolha.linha = String.valueOf(util.TranscreverHorizontal(escolha.linha));
        listaDeTiros = verificarOAlvo(mapa, escolha, listaDeTiros, vetorDeVidas);// vai verificar se a localização já
                                                                                 // foi usada
        return listaDeTiros;
    }

    public static List<EscolhaVO> verificarOAlvo(EmbacacaoVO[][] mapa, EscolhaVO escolha, List<EscolhaVO> listaDeTiros,
            int[] vetorDeVidas) {// no outpu no App, se o input for diferente do mais novo da lista é pq ele não
                                 // foi aceito
        boolean taNaLista = true;
        for (int i = 0; i < listaDeTiros.size(); i++) {
            if (listaDeTiros.get(i).coluna == escolha.coluna && listaDeTiros.get(i).linha == escolha.linha) {
                return listaDeTiros;// se tiver na lista ele já retorna a lista sem mudar nada.
            } else {// se não tiver ele deixa false
                taNaLista = false;
            }

        }
        if (!taNaLista) {// se ele não estiver na lista de tiro, é pq está valido para atirar
            atirar(mapa, escolha, vetorDeVidas);
            listaDeTiros.add(escolha);
        }
        return listaDeTiros;
    }

    public static void atirar(EmbacacaoVO[][] mapa, EscolhaVO escolha, int[] vetorDeVidas) {
        int linha = Integer.parseInt(escolha.linha);
        int coluna = Integer.parseInt(escolha.coluna);

        if (!mapa[linha][coluna].agua && !mapa[linha][coluna].hud) {// se não for água e hud ele faz algo, se não já
                                                                    // pula
            if (Integer.parseInt(escolha.linha) == linha && Integer.parseInt(escolha.coluna) == coluna) {
                mapa[linha][coluna].atingido = true;
                vetorDeVidas[mapa[linha][coluna].posVetorVida] = vetorDeVidas[mapa[linha][coluna].posVetorVida] - 1;
            }

        }
    }
}