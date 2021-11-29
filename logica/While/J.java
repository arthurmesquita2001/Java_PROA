package while_repeticao;
/**
 * @author Tuco
 * Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
//pares situados na faixa numérica de 50 a 70.
 */
public class J {
    public static void main(String[] args) {
        funcao_j();
    }
    public static void funcao_j(){
        double acumulador=0;
        int cont=50,divisor=0;

        while(cont<=70){
            if(cont%2==0){
                acumulador=acumulador+cont;
                divisor++;
            }
        cont++;
        }
        System.out.println((acumulador/divisor));
    }
}
