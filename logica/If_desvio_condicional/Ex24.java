package desvio_condicional;

import java.util.Scanner;

/**
 * Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total.
@author Arthur Mesquita Rocha
 */

public class Ex24 {
    public static void main(String[] args) {
        Horas_extra();
    }
    public static void Horas_extra(){
        Scanner i = new Scanner(System.in);

        int total_hrs,excendente;
        double valor;

        System.out.println("Horas trabalhadas no mês");
        total_hrs=i.nextInt();

        System.out.println("Salario hr");
        valor=i.nextDouble();

        if(total_hrs>160){
            excendente=total_hrs-160;
            System.out.println("Receber: R$ "+((excendente*1.5*valor)+(160*valor)));
        }else{
            System.out.println("Receber: R$ "+(total_hrs*valor));
        }

    }

    
}
