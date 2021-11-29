package desvio_condicional;

import java.util.Scanner;

/**
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas).
@author Arthur Mesquita Rocha
 */

public class Ex22 {
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
