package repeticao_do_while;
/**
 * @author Arthur Mesquita Rocha
 * Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o
//número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a
//instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o
//próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1
 */

public class c {
    public static void main(String[] args) {
        Funcao_4();
    }
    public static void Funcao_4(){
        int cont = 1;

do {
    if (cont % 4 == 0) {
       System.out.println(" O " + cont + " é divisível por 4");
    }
    cont++;
} while (cont <= 200);
    }
}
