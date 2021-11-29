package repeticao_do_while;

import java.util.Scanner;

/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o
//total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras
//dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
//parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
//como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da
//média.
 */
public class f {
    public static void main(String[] args) {
        ex_f();
    }
    public static void ex_f(){
        Scanner w = new Scanner(System.in);
        double acumulador = 0,n=0,
        qtd = 0;
do {
    System.out.println("Entrada");
    n = w.nextDouble();
    if (n >= 0) {
        acumulador = n + acumulador;
        qtd++;
    }
} while (n >= 0);

System.out.println("O final é: " + acumulador + ", a quantidade de valores lidos é: " + qtd + " Logo média aritmética -> " + acumulador + " / " + qtd + " = " + (acumulador / qtd));
    }
}
