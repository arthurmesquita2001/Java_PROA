package repeticao_do_while;

import java.util.Scanner;

/**
 * @author Arthur Mesquita Rocha
 * laborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente o
//total do somatório da fatorial de cada valor lido.
 */
public class e {
    public static void main(String[] args) {
        somaFatorial();
    }
    public static void somaFatorial(){
        Scanner ex = new Scanner(System.in);
        int cont = 1; 
        double soma = 0;


do {
    int aux = 1;
    double acumulador = 1;

    System.out.println("Entre o número");
    int valor = ex.nextInt();

    while (aux <= valor) {
        acumulador = acumulador * aux;
        aux = aux + 1;
    }
    System.out.println(" O fatorial de: " + valor + ". é igual " + acumulador);

    soma = acumulador + soma;



    cont = cont + 1;

} while (cont <= 15);


System.out.println(" O valor final é " + soma);
    }
}
