package repeticao_do_while;

import java.util.Scanner;

/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
//seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
//usuário.
 */
public class i {
    public static void main(String[] args) {
        Ex_i();
    }
    public static void Ex_i(){
    
    Scanner ok = new Scanner(System.in);

    int maior = 0,menor = 0,n;
    System.out.println("Valor");
    n = ok.nextInt();
    maior = n;
    menor = n;

    do {
        if (maior < n) {
            maior = n;
        } else if (menor > n) {
            menor = n;
        }
        System.out.println("Valor");
        n = ok.nextInt();
    } while (n >= 0);

    System.out.println("O  menor é: " + menor+". E o maior é: " + maior);
        }
}
