package repeticao_do_while;

import java.util.Scanner;

/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
//banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
//nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
//do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
//calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
//total acumulado da área residencial.
 */
public class h {
    public static void main(String[] args) {
      Scanner y = new Scanner(System.in);
      Scanner v = new Scanner(System.in);
      String resposta ="SIM";
      double total = 0;
do {
   System.out.println("Qual região da casa que você quer?");
   String comodo = v.nextLine();
    if (comodo != "NAO") {
        System.out.println("Comprimento");
        double comprimeto = y.nextDouble();
        System.out.println("Largura");
        double largu = y.nextDouble();
        total = total + (comprimeto + largu);
    }
    System.out.println("Quer repetir o sistema?");
    resposta = v.nextLine();
} while (!resposta.equals("NAO") );

System.out.println(" área = " + total);
    }
}
