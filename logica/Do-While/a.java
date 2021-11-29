package repeticao_do_while;
/**
 * Apresentar do 15 até 200 o valor ao quadrado
 * @author AM
 */

public class a{
    public static void main(String[] args) {
    Quadrado();
}
    public static void Quadrado(){
        int cont = 15;
        do {
            System.out.println(cont + "² = " + (cont * cont));
            cont++;
        } while (cont <= 200);
}
}
