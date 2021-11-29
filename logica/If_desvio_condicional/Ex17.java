package desvio_condicional;

import java.util.Scanner;

/**
 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
 * @author Arthur Mesquita Rocha
 */
public class Ex17 {

    public static void main(String[] args) {
        nota();
    }

    public static void nota(){

        Scanner nota = new Scanner(System.in);
        double n1=0,n2=0;

        System.out.println("Entre a nota da provas");
        n1=nota.nextDouble();
        n2=nota.nextDouble();

        if(((n1+n2)/2)>=6){
            System.out.println("Aprovado, nota final "+((n1+n2)/2));
        }
        else{
            System.out.println("Reprovado, nota final "+((n1+n2)/2));
        }

        

    }
}

