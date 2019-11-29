package app;

import java.io.Console;
import java.io.IOException;

/**
 * Waifu1 Responsavel pelas falas para o jogador Com metodos de escrita de fala,
 * que pode variar
 */
public class Waifu {

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

    public static double random = 0;

    public void falarVoceGanhou() {
        // Texto azul claro
        System.out.println("uau comandante");
    }

    public void falarAcertouAgua() {
        random = Math.random();
        random *= 10;
        random = Math.round(random);
        System.out.println(random);
        if (random < 4) {
            System.out.println(ANSI_CYAN + "I-19: Poxa Almirante, você acertou na água" + ANSI_RESET);
        } else {
            if (random < 7) {
                System.out.println(ANSI_CYAN + "I-19: Vamos lá Almirante, você conseguie!" + ANSI_RESET);
            } else {
                System.out.println(
                        ANSI_CYAN + "I-19: Almirante seu bobo, você não está se esforçando o suficiente" + ANSI_RESET);
            }
        }
    }

    public void falarAcertouDD() {
        System.out.println(ANSI_CYAN + "I-19: EU PEGUEI VOCÊ!" + ANSI_RESET);
    }

    public void falarAcertouPPPP() {
        random = Math.random();
        random *= 10;
        random = Math.round(random);
        System.out.println(random);
        if (random < 5) {
            System.out.println(ANSI_BLUE + "Yahagi: Boa Almirante" + ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE + "Yahagi: Vamos lá Almirante, você conseguie!" + ANSI_RESET);
        }
    }

    public void falarAfundouPPPP() {
        System.out.println(ANSI_BLUE + "Yahagi: NÃO VOU DEIXAR QUE MACHUQUEM YAMATO-SAMA!" + ANSI_RESET);
    }// OBRIGADA ALMIRANTE GRAÇAS A VOCÊ YAMATO-SAMA ESTA MAIS SEGURA

    public void falarAcertouSubmarino() {
        random = Math.random();
        random *= 10;
        random = Math.round(random);
        System.out.println(random);
        if (random < 4) {
            System.out.println(ANSI_GREEN + "Zuikako: Parem de se esconder e me enfrentem!" + ANSI_RESET);
        } else {
            if (random < 7) {
                System.out
                        .println(ANSI_GREEN + "Zuikako: Tenha cuidado Almirante, elas são muito espertas" + ANSI_RESET);
            } else {
                System.out.println(ANSI_GREEN + "Zuikako: SINTAM A IRA DO PORTA AVIOES ZUIKAKO!" + ANSI_RESET);
            }
        }
    }

    public void falarAcertouRepetido() {
        System.out.println(
                ANSI_GREEN + "Zuikako: Preste atenção Almirante, você já escolheu essa coordenada" + ANSI_RESET);
    }

    public void falarAcertouCCCC() {
        random = Math.random();
        random *= 10;
        random = Math.round(random);
        System.out.println(random);
        if (random < 5) {
            System.out.println(ANSI_YELLOW + "Hatsuzuki: Parabéns Almirante" + ANSI_RESET);
        } else {
            if (random < 7) {
                System.out.println(
                        ANSI_YELLOW + "Hatsuzuki: Almirante mantenha o foco não podemos parar agora" + ANSI_RESET);
            } else {
                System.out.println(ANSI_YELLOW + "Hatsuzuki: SINTAM A IRA DO PORTA AVIOES ZUIKAKO!" + ANSI_RESET);
            }
        }

    }

    public void falarBemVindo() {
        System.out.println(
                ANSI_YELLOW + "Hatsuzuki: Bem vindo Almirante, estamos esperando pelo seu comando" + ANSI_RESET);
    }

    public void falarAfundouDD() {
        System.out.println(
                ANSI_CYAN + "I-19: Almirante nos Conseguimos esse destroyer nao ira mais nos incomodar" + ANSI_RESET);
    }

    public void falarErrouDeMais() {
        System.out.println(ANSI_CYAN + "I-19: Almirante você errou muito precisa se esforçar mais" + ANSI_RESET);
    }

    public void falarAcertouMuito() {
        System.out.println(
                ANSI_BLUE + "Yahagi: Parabéns Almirante voce foi muito bem, porem não deixe o sucesso subir a cabeça"
                        + ANSI_RESET);
    }

    public void falarObrigadoPorJogar() {
        System.out.println(ANSI_BLUE
                + "Yahagi: Parabéns Almirante voce foi muito bem mas nao fique longe por muito tempo, não queremos que suas habilidades enferrugem"
                + ANSI_RESET);

    }

    //Graças aos seus esforços conseguimos derrotalas almirante?
    public void falarAfundouCCCC(){
        System.out.println(ANSI_YELLOW + "Hatsuzuki: Parabéns Almirante" + ANSI_RESET);
    }

    public void intro() {

        String barra = "\\";
        System.out.println(ANSI_GREEN
                + "Zuikako: almirante nos detectamos uma frota de navios  inimigos \n perto das Filipinas e precisamos interceptar antes que eles cheguem a costa"
                + ANSI_RESET);
        System.out.println("pressione Enter para continuar:");
        System.console().readLine();

        System.out.println("   __|__ |___| |" + barra);
        System.out.println("   |o__| |___| | " + barra);
        System.out.println("   |___| |___| |o " + barra);
        System.out.println("  _|___| |___| |__o" + barra);
        System.out.println(" /..." + barra + "_____|___|____" + barra + "_/");
        System.out.println(" " + barra + "   o * o * * o o  /");
        System.out.println(ANSI_BLUE_BACKGROUND + "~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);

        for (int i = 0; i < 14; i++) {
            System.out.print("\033[H\033[2J");  // limpa tela
            System.out.flush(); //limpa tb

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   __|__ |___| |" + barra);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   |o__| |___| | " + barra);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   |___| |___| |o " + barra);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("  _|___| |___| |__o" + barra);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" /..." + barra + "_____|___|____" + barra + "_/");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" " + barra + "   o * o * * o o  /");
            for (int j = 0; j < i; j++) {
                System.out.print(ANSI_BLUE_BACKGROUND + "~" + ANSI_RESET);
            }
            System.out.println(ANSI_BLUE_BACKGROUND + "~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

    }

    
    //obrigado por ler até aqui :)
    //CCRV COMPANY AGRADECE A SUA VISITA 
    public Waifu() {
    }
    
}