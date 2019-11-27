package app;

/**
 * EscolhaVO
 * objeto que irá receber os dados do jogador e fica mais facil de jogar entre os 
 * metodos :)
 */
public class EscolhaVO {

    String linha;
    String coluna;

    EscolhaVO(){} //construtor vazio
    EscolhaVO(String linha,String coluna){
        
        this.linha=linha;
        this.coluna=coluna;
    }
    

}