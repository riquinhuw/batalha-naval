package app;

/**
 * InformacaoVO
 */
public class InformacaoVO {

    public int linha;
    public int coluna;
    public char letra;
    public int indice_embarcacao;


    public InformacaoVO(){}
    public InformacaoVO(String linha){
        linha.replaceAll("\\s+", " ");// expressão regular para localizar o espaço e apagar
        this.linha = linha.charAt(0) ;
        this.coluna = linha.charAt(1);
        this.letra = linha.charAt(2);
        this.indice_embarcacao = linha.charAt(3);
    }
}