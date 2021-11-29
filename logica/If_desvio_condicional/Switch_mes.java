package desvio_condicional;

import java.util.Scanner;
/**
 *Faça um algoritmo que leia o número escolhido pelo usuário e diga o mês do ano de acordo com o número. (Utilizando "Se" e "Escolha/caso")
 * @author Arthur
 */

public class Switch_mes {
    public static void main (String args[]){
        mes_aniversario();
    }

    public static void mes_aniversario(){ 
        Scanner buffer = new Scanner(System.in);
        int mes;

        System.out.println("Qual o número do mês que você nasceu: ");
        mes=buffer.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            default:
            System.out.println("Dezembro");
                break;
        }

    }
}
