package while_repeticao;
/**
@author Arthur mesquita ROCHA 
* Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de
//Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza
//pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo
//valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo
//é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc. */

public class G {
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci(){
        int v1 = 1, v2 = -1, v3 = 0, cont = 0;


    while (cont <= 15) {
    v3 = v1 + v2;
    v2 = v1;
    v1 = v3;
    System.out.print( v3 + "  " );
    cont++;
}
    }
}
