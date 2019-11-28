package app;

/**
 * Util
 */
public class Util {


    public int TranscreverHorizontal(String letra){
        // recebe letras deveolve o numero
        letra = letra.toUpperCase();
        switch (letra) {// existe uma forma melhor, usando apenas char para ver qual é o seu numero, mas né é Java.
            case "A":
                return 1;

            case "B":
                return 2;

            case "C":
                return 3;
                
            case "D":
                return 4;
                
            case "E":
                return 5;
                
            case "F":
                return 6;

            case "G":
                return 7;
                
            case "H":
                return 8;

            case "I":
                return 9;

            case "J":
                return 10;

          default:
            return 404;// para falar que não está no tabuleiros
        }
    }

    public String DesTranscreverHorizontal(String letra){
        // recebe letras deveolve o numero
        switch (letra) {// existe uma forma melhor, usando apenas char para ver qual é o seu numero, mas né é Java.
            case 1:
                return "A";

            case 2:
                return "B";

            case 3:
                return "C";
                
            case 4:
                return "D";
                
            case 5:
                return "E";
                
            case 6:
                return "F";

            case 7:
                return "G";
                
            case 8:
                return "H";

            case 9:
                return "I";

            case 10:
                return "J";

          default:
            return 404;// para falar que não está no tabuleiros
        }
    }
}