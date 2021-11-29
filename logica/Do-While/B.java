package repeticao_do_while;
    
/**
 *  Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.
 * @author AM
 */

public class B {
    public static void main(String[] args) {
        somatorio();
    }
    public static void somatorio(){
        int somatorio = 0,z = 1;

do {
    if (z % 2 == 0) {
        somatorio = somatorio + z;
    }
    z++;

} while (z <= 500);

System.out.println("O valor é: " + somatorio);
}
}


