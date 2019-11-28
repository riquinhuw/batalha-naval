package app;

import java.io.Console;
import java.util.List;

/**
 * TelaRefresh Responsavel em ficar escrevendo na tela Lendo o vetor de barcos e
 * setando
 */
public class TelaRefresh {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public DadosVO adicionarEmbarcacoes(List<InformacaoVO> listaDeInformacao, DadosVO dadosAtuais) {
        try {
            while (listaDeInformacao.isEmpty() != true) {// pegando as informacoes da lista e setando no mapa
                InformacaoVO info = new InformacaoVO();
                info = listaDeInformacao.get(0);
                dadosAtuais.mapa[info.linha][info.coluna].agua = false;
                dadosAtuais.mapa[info.linha][info.coluna].letra = info.letra;
                dadosAtuais.mapa[info.linha][info.coluna].posVetorVida = info.indice_embarcacao; // para setar onde a vida ele ficará no vetor de vidac2
                dadosAtuais.vetorDeVidas[dadosAtuais.mapa[info.linha][info.coluna].posVetorVida]++; // para setar +1 na vida do barco
                listaDeInformacao.remove(0);
                
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return dadosAtuais;
    }

    public void lerMapaEscrever(EmbacacaoVO[][] matriz) {
        // inicialmente tem que começar criando o hud.
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                if (matriz[i][j].hud == true) {// se for hud ele printa o hud
                    if (i == 0) {// se for na coluna inicial, digite as letras
                        if (j == 10) {
                            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                        } else {
                            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                        }

                    } else {
                        if (j == 0) {// se for na linha inicial digite os numeros.
                            if (j == 10) {
                                System.out
                                        .println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                            } else {
                                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                            }

                        }
                    }
                } else {// se não for HUD ele é do mapa
                    if (matriz[i][j].agua == true) {// se for mar ele printa de azul
                        if (j == 10) {
                            System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                        } else {
                            System.out.print(ANSI_BLUE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                        }

                    } else {// SE NÃO FOR MAR ELE É OU BARCO VIVO OU BARCO ATINGIDO
                        if (matriz[i][j].atingido == true) {
                            if (j == 10) {
                                System.out.println(ANSI_RED_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                            } else {
                                System.out.print(ANSI_RED_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                            }
                        } else {
                            // se não foi atingido ainda, vai ficar escondido, tem que trocar matriz letra por " " para esconder os barcos
                            if (j == 10) {
                                System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                            } else {
                                System.out.print(ANSI_BLUE_BACKGROUND + ANSI_BLACK + matriz[i][j].letra + ANSI_RESET);
                            }

                        }
                    }

                }

            }
        }
    }

    public static void instanciarMapa(EmbacacaoVO[][] mapa) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                mapa[i][j] = new EmbacacaoVO();
            }
        }

    }



    public void criarHud(EmbacacaoVO[][] matriz) {
        // Coluna inicial
        matriz[1][0].hud = true;
        matriz[1][0].letra = "A";
        matriz[2][0].hud = true;
        matriz[2][0].letra = "B";
        matriz[3][0].hud = true;
        matriz[3][0].letra = "C";
        matriz[4][0].hud = true;
        matriz[4][0].letra = "D";
        matriz[5][0].hud = true;
        matriz[5][0].letra = "E";
        matriz[6][0].hud = true;
        matriz[6][0].letra = "F";
        matriz[7][0].hud = true;
        matriz[7][0].letra = "G";
        matriz[8][0].hud = true;
        matriz[8][0].letra = "H";
        matriz[9][0].hud = true;
        matriz[9][0].letra = "I";
        matriz[10][0].hud = true;
        matriz[10][0].letra = "J";
        // linha superior
        matriz[0][1].hud = true;
        matriz[0][1].letra = "1";
        matriz[0][2].hud = true;
        matriz[0][2].letra = "2";
        matriz[0][3].hud = true;
        matriz[0][3].letra = "3";
        matriz[0][4].hud = true;
        matriz[0][4].letra = "4";
        matriz[0][5].hud = true;
        matriz[0][5].letra = "5";
        matriz[0][6].hud = true;
        matriz[0][6].letra = "6";
        matriz[0][7].hud = true;
        matriz[0][7].letra = "7";
        matriz[0][8].hud = true;
        matriz[0][8].letra = "8";
        matriz[0][9].hud = true;
        matriz[0][9].letra = "9";
        matriz[0][10].hud = true;
        matriz[0][10].letra = "10";
    }

    public void testeDeTela() {
        System.out.println(ANSI_RED + "A GUERRA COMEÇOU! CUIDADO" + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "       " + ANSI_RESET + ANSI_PURPLE_BACKGROUND
                + ANSI_BLACK + "X" + ANSI_RESET + ANSI_BLUE_BACKGROUND + ANSI_BLACK + "  " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "       C  " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "          " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "          " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "       C  " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "          " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "          " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "          " + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "        " + ANSI_RESET + ANSI_RED_BACKGROUND
                + ANSI_BLACK + "DD" + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "          " + ANSI_RESET);
    }

}