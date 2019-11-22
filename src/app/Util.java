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
}