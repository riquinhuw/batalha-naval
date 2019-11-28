package app;

/**
 * Waifu1
 * Responsavel pelas falas para o jogador
 * Com metodos de escrita de fala, que pode variar
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
            System.out.println(ANSI_CYAN + "Poxa Almirante, você acertou na água" + ANSI_RESET);
        } else {
            if (random < 7) {
                System.out.println(ANSI_CYAN + "Vamos lá Almirante, você conseguie!" + ANSI_RESET);
            } else {
                System.out.println(
                        ANSI_CYAN + "Almirante seu bobo, você não está se esforçando o suficiente" + ANSI_RESET);
            }
        }
    }

    public void falarAcertouDD() {
        System.out.println(ANSI_CYAN + "EU PEGUEI VOCÊ!" + ANSI_RESET);
    }

    public Waifu() {
    }
    
}