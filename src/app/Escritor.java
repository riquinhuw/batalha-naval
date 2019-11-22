package app;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Escritor Função de escrever e ler o arquivo
 */
public class Escritor {

    public void lerTxtMapa() {//colocar para receber uma string que vai vir do args

        try (Scanner arquivo = new Scanner(new FileReader("mapas/tabuleiro.txt"))) {
            while (arquivo.hasNext()) {
                String primeiroNome = arquivo.next();
                String ultimoNome = arquivo.next();
                int idade = arquivo.nextInt();
                System.out.println(primeiroNome + " " + ultimoNome + " tem " + idade + " anos de idade.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}