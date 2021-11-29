package desvio_condicional;

import java.util.Scanner;

/**
 *  Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'.
@author Arthur Mesquita Rocha
 */

public class Ex26 {
    public static void main(String[] args) {
        estoque();
    }
    public static void estoque(){
        Scanner quantidade = new Scanner(System.in);

        int atual,maxima,minima;

        System.out.println("Valor atual");
        atual=quantidade.nextInt();

        System.out.println("Valor mínimo");
        minima=quantidade.nextInt();

        System.out.println("Valor máximo");
        maxima=quantidade.nextInt();

        System.out.println("A quantidade média é: "+((maxima+minima)/2));
        if(atual>=((maxima+minima)/2)){
            System.out.println("Não efetuar compra ");
        }else{
            System.out.println("Efetuar compra");
        }

    }

    
}
