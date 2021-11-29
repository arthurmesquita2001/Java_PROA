package desvio_condicional;

import java.util.Scanner;

/**
 * //Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:
//- Ter no mínimo 65 anos de idade.
//- Ter trabalhado no mínimo 30 anos.
//- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
//de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
//de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

 */


public class Ex42 {
    public static void main(String[] args) {
        calculo_trabalho();
    }

    public static void calculo_trabalho(){
        Scanner trabalho = new Scanner(System.in);
        int codigo,ano_nasc,tempo_empres;

        System.out.println("Digite o código");
        codigo=trabalho.nextInt();


        System.out.println("Digite o ano de nascimento");
        ano_nasc=trabalho.nextInt();


        System.out.println("Digite o ano de ingresso");
        tempo_empres=trabalho.nextInt();


        if( (2021-ano_nasc>=65) ||(2021-tempo_empres>=30) || ((2021-ano_nasc>=60)&&(2021-tempo_empres>=25))){
            System.out.println("Requerer aposentadoria,idade = "+(2021-ano_nasc)+" anos e tempo de trabalho = "+(2021-tempo_empres)+" anos");

        }


        else{
            System.out.println("Não vai,idade = "+(2021-ano_nasc)+" anos e tempo de trabalho = "+(2021-tempo_empres)+" anos");
        }

    }
}
