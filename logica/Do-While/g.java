package repeticao_do_while;
/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
//situados na faixa numérica de 1 a 10
 */
public class g {
    public static void main(String[] args) {
    F_impar();
    }
    public static void F_impar(){
        int cont = 1,
    soma = 1,
    cont_2 = 1;

do {
    cont_2 = 1;
    soma = 1;
    if (cont % 2 == 1) {
        while (cont_2 <= cont) {
            soma *= cont_2;
            cont_2++;
        }
       System.out.println("!" + cont + " = " + soma);
    }
    cont++;
} while (cont <= 10);
    }
}
