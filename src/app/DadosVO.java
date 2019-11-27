package app;

import java.util.ArrayList;
import java.util.List;

/**
 * DadosVO
 */
public class DadosVO {

    public  List<EscolhaVO> listaDeTiros = new ArrayList<EscolhaVO>();
    public  EmbacacaoVO[][] mapa = new EmbacacaoVO[11][11];
    public  int vetorDeVidas[]= new int[10];

    DadosVO(){}
    DadosVO(List<EscolhaVO> listaDeTiros,EmbacacaoVO[][] mapa,int[] vetorDeVidas ){
        this.listaDeTiros=listaDeTiros;
        this.mapa = mapa;
        this.vetorDeVidas = vetorDeVidas;
    }
}