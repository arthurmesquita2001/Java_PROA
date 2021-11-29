package desvio_condicional;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 * @author Arthur Mesquita Rocha
 */
public class Ex18 {

    public static void main(String[] args) {
        voto();
    }

    public static void voto(){

        Scanner voto = new Scanner(System.in);
        int ano;
        Calendar cal = Calendar.getInstance();
        int ultimo= cal.get(Calendar.YEAR);

        System.out.println("Digite o ano que você nasceu");
        ano=voto.nextInt();

        if((ultimo-ano)>=16){
            System.out.println("Você irá votar, idade:  "+(ultimo-ano));
        }
        else{
            System.out.println("Você não irá votar, idade: "+(ultimo-ano));
        }

    }
}

