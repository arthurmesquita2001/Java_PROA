package desvio_condicional;

import java.util.Scanner;

/**
 * Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
//ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
//dos outros 2 lados.
@author Arthur Mesquita Rocha
 */

public class Ex31 {
    public static void main(String[] args) {
        Formar_triangulo();
    }
    public static void Formar_triangulo(){
        Scanner buffer= new Scanner(System.in);

        int valor,valor1,valor2;

        System.out.println("Entre com 3 números");
        valor=buffer.nextInt();
        valor1=buffer.nextInt();
        valor2=buffer.nextInt();

        if(valor>(valor1+valor2)){
            System.out.println(" Não forma um triângulo ");
        }
        else if(valor1>(valor+valor2)){
            System.out.println(" Não forma um triângulo ");
        }
        else if(valor2>(valor+valor1)){
            System.out.println(" Não forma um triângulo ");
        }
        else{
            System.out.println("Forma um triângulo ");
        }
    }

    
}
