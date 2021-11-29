import java.util.Scanner;

/**
 * @author Arthur 
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
public class Idade_dias {
    public static void main(String[] args) {
        Calculo_idade();
    }

    public static void Calculo_idade(){
        int anos,meses,dias;
        Scanner data = new Scanner(System.in);

        System.out.println("Digite quantos anos você tem:");
        anos=data.nextInt();
        System.out.println("Digite quantos meses você tem:");
        meses=data.nextInt();
        System.out.println("Digite quantos dias você tem:");
        dias=data.nextInt();

        System.out.println("Sua idade em dias será: "+((anos*365)+(meses*30)+dias));

    }
}
