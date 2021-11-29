package for_repeticao;

/**
 * @author
 * Apresentar os quadrados dos números inteiros de 15 a 200
 */

public class A {
    public static void main(String[] args) {
        Soma_quadrado();
    }
    public static void Soma_quadrado(){
        
        int i;
        for(i=15;i<=200;i++){
            System.out.println(i+"² ="+(Math.pow(i, 2)));
        }
    }
}
