package app;

/**
 * PppppVO
 */
public class PortaAviaoVO {

    String eixo; // h para horizontal e v para vertical
    int parte; // que parte ele é do barco, no caso do Porta aviões, de 1 a 5
    boolean atingido; // se essa parte foi atingido.
    boolean destruido; // se todo o barco foi destruido.
    // criar verificador de quando todas as partes são atingidas.

    public static void main(String[] args) {
        
    }

    public PortaAviaoVO(){}
    public PortaAviaoVO(String eixo,int parte){
        this.eixo = eixo;
        this.parte = parte;
    }

    public void Atingido(){
        this.atingido=true;
    }
}