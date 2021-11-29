import java.util.Scanner;
/**
 * @author Arthur Mesquita Rocha
 * Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média final é:

//mediafinal = (n1 * 2 + n2 * 3 + n3 * 5)/10
 */

public class Media_ponderada {
    public static void main(String[] args) {
        Nota_final();

    }
    public static void Nota_final(){
        Scanner w = new Scanner(System.in);
        double not1,not2,not3;

        System.out.println("Digite as 3 notas respectivamente: ");
        not1=w.nextDouble();
        not2=w.nextDouble();
        not3=w.nextDouble();

        System.out.println("A nota final é: "+((not1*2+not2*3+not3*5)/10));
    }
}
