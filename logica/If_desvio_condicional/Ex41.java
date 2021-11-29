package desvio_condicional;

import java.util.Scanner;

/**
 Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:

//N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
//Média_de_Aproveitamento = ---------------------------------------------------------

//7
@author Arthur Mesquita Rocha
 */

public class Ex41 {
    public static void main(String[] args) {
       nota_final();
    }
    public static void nota_final(){
        Scanner buffer= new Scanner(System.in);

        double n1,n2,n3,exerc,nota_final;
        

        System.out.println("Digite a nota 1");
        n1=buffer.nextDouble();
        
        System.out.println("Digite a nota 2");
        n2=buffer.nextDouble();
        
        System.out.println("Digite a nota 3");
        n3=buffer.nextDouble();
        
        System.out.println("Digite a media dos exercicios");
        exerc=buffer.nextDouble();
        
        nota_final=(n1 + n2 * 2 + n3 * 3 + exerc)/7;
        
        if( nota_final<6) {
            System.out.println("Nota final: "+nota_final+" equivalente ao conceito D");
        }
        
        else if( (nota_final<7.5) && (nota_final>=6)) {
            System.out.println("Nota final: "+nota_final+" equivalente ao conceito C");
        }
        
        
        else if((nota_final<9) && (nota_final>=7.5)){
        System.out.println("Nota final: "+nota_final+" equivalente ao conceito B");
    }
        else{
        System.out.println("Nota final: "+nota_final+" equivalente ao conceito A");
        }
        
    }
}

    
