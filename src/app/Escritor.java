package app;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Escritor Função de escrever e ler o arquivo
 */

public class Escritor {
    public List<InformacaoVO> listaDeInformação = new ArrayList<InformacaoVO>();
    public List<InformacaoVO> lerTxtMapa() {//colocar para receber uma string que vai vir do args

        try (Scanner arquivo = new Scanner(new FileReader("tabuleiro.txt"))) {//tentar nao por na pasta.
            while (arquivo.hasNext()) {
                String juntarTexto = arquivo.next();
                juntarTexto = juntarTexto+ arquivo.next();
                juntarTexto = juntarTexto+ arquivo.next();
                juntarTexto = juntarTexto+ arquivo.next();
                InformacaoVO info = new InformacaoVO(juntarTexto);
                listaDeInformação.add(info);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return listaDeInformação;
    }
}