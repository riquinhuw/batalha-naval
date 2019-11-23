package app;

/**
 * InformacaoVO
 */
public class InformacaoVO {

    public int linha;
    public int coluna;
    public String letra;
    public int indice_embarcacao;


    public InformacaoVO(){}
    public InformacaoVO(String linha){
        //linha.replaceAll("\\s+", " ");// expressão regular para localizar o espaço e apagar
        this.linha = Integer.parseInt(linha.substring(0,1))+1  ;
        System.out.println(this.linha);
        this.coluna = Integer.parseInt(linha.substring(1,2))+1;
        System.out.println(this.coluna);
        this.letra = String.valueOf(linha.charAt(2)) ;
        System.out.println(this.letra);
        this.indice_embarcacao = Integer.parseInt(linha.substring(3));
        System.out.println(this.indice_embarcacao);
    }
}