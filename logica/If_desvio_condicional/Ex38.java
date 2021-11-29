package desvio_condicional;

import java.util.Scanner;

/**
Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
//diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
//mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
//esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
//senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.

@author Arthur Mesquita Rocha
 */

public class Ex38 {
    public static void main(String[] args) {
       Usuario();
    }
    public static void Usuario(){
        Scanner buffer= new Scanner(System.in);

        int entrada, senha;
        

        System.out.println("Código de usuário");
        entrada=buffer.nextInt();
        
        if(entrada!=1234){
            System.out.println("Usuário inválido");
        }
        else{
            System.out.println("Senha do usuário: ");
            senha=buffer.nextInt();

            if(senha==9999){
                System.out.println("Acesso permitido");
            }
            else{
                System.out.println("Negado");
            }
        }
        
        
    }

    
}
