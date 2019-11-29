package app;

/**
 * InformacaoVO
 */
public class InformacaoVO {
    //Guarda informações do documento TXT, na hora de transcrever para o Jogo
    public int linha;
    public int coluna;
    public String letra;
    public int indice_embarcacao;


    public InformacaoVO(){}
    public InformacaoVO(String linha){
        this.linha = Integer.parseInt(linha.substring(0,1))+1;// +1 por causa do hud
        this.coluna = Integer.parseInt(linha.substring(1,2))+1; // +1 por causa do hud
        this.letra = String.valueOf(linha.charAt(2)) ;
        this.indice_embarcacao = Integer.parseInt(linha.substring(3));
    }
}