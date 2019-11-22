package app;

/**
 * PppppVO
 */
public class PppppVO {

    String eixo; // h para horizontal e v para vertical
    int parte; // que parte ele é do barco, no caso do Porta aviões, de 1 a 5
    boolean atingido; // se essa parte foi atingido
    // criar verificador de quando todas as partes são atingidas.

    public static void main(String[] args) {
        
    }

    public PppppVO(){}
    public PppppVO(String eixo,int parte){
        this.eixo = eixo;
        this.parte = parte;
    }

    public void Atingido(){
        this.atingido=true;
    }
}