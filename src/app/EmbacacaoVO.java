package app;

/**
 * PppppVO
 */
public class EmbacacaoVO {

    int posVetorVida; // que parte ele é do barco, no caso do Porta aviões, de 1 a 5
    boolean atingido; // se essa parte foi atingido.
    boolean agua =true; // se todo o barco foi destruido.
    boolean hud;
    String letra=" ";
    // criar verificador de quando todas as partes são atingidas.

    public static void main(String[] args) {
        
    }

    public EmbacacaoVO(){}
    public EmbacacaoVO(String eixo,int posVetorVida,String letra){
        this.posVetorVida = posVetorVida;
        this.agua=false;
        this.letra=letra;
    }

    public void Atingido(){
        this.atingido=true;
    }
}