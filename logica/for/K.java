package for_repeticao;
/**Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
//situados na faixa numérica de 1 a 10.
// @author  Arthur Mesquita Rocha
*/ 
public class K {
    public static void main(String[] args) {
        fatorial_impares();
    }
    public static void fatorial_impares(){
        int acumulador,j,k;
    for(j=1;j<=10;j++){
    acumulador=1;
    k=1;
    if (j%2==1) {
        for(k=1;k<=j;k++){
            acumulador*=k;
        }
    System.out.println(j+"! = "+acumulador);
}
    }
    }
}
