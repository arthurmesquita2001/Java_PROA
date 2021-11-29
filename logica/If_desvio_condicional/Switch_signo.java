package desvio_condicional;

import java.util.Scanner;
/**
 *Faça um algoritmo que leia o número escolhido pelo usuário e diga o mês do ano de acordo com o número. (Utilizando "Se" e "Escolha/caso")
 * @author Arthur
 */

public class Switch_signo {
    public static void main (String args[]){
        Signo();
    }

    public static void Signo(){ 
        Scanner buffer = new Scanner(System.in);
        String nome;

        System.out.println("Qual o número do mês que você nasceu: ");
        nome=buffer.nextLine();

        switch (nome) {
            case "ARIES":
                System.out.println("de 21 de março a 20 de abril");
                break;
            case "TOURO":
                System.out.println("de 21 de abril a 20 de maio");
                break;
            case "GEMEOS":
                System.out.println("de 21 de maio a 20 de junho");
                break;
            case "CANCER":
                System.out.println("de 21 de junho a 22 de julho");
                break;
            case "LEAO":
                System.out.println("de 23 de julho a 22 de agosto");
                break;
            case "VIRGEM":
                System.out.println("de 23 de agosto a 22 de setembro");
                break;
            case "LIBRA":
                System.out.println("de 23 de setembro a 22 de outubro");
                break;
            case "ESCORPIAO":
                System.out.println("de 23 de outubro a 21 de novembro");
                break;
            case "SARGITARIO":
                System.out.println("de 22 de novembro a 21 de dezembro");
                break;
            case "PEIXES":
                System.out.println("de 19 de fevereiro a 20 de março");
                break;
            case "AQUARIO":
                System.out.println("de 21 de janeiro a 18 de fevereiro");
                break;
            default:
            System.out.println("de 22 de dezembro a 20 de janeiro");
                break;
        }

    }
}
