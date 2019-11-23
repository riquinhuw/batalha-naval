package app;

/**
 * PppppVO
 */
public class EmbacacaoVO {

    int posVetorVida=11; // a posicao dele no vetor de vida, default 11 para a água não interferir
    boolean atingido; // se essa parte foi atingido.
    boolean agua =true; // se todo o barco foi destruido.
    boolean hud;
    String letra=" ";// deixar assim para printar o vazio
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