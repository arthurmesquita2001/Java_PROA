package while_repeticao;
/**
 * @author Arthur Mesquita Rocha
 * Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
//considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
//neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
 */
public class E {
    public static void main(String[] args) {
        potencia_3();
    }
    public static void potencia_3(){
        int res=3,cont=0;

        while(cont<=15){
            if(cont==0){
                System.out.println("3 elevado a 0 = 1");
            }
            else if(cont==1){
                System.out.println("3 elevado a 1 = 3");
            }
            else{
                    res=3*res;
                    System.out.println("3 elevado a "+cont+ "=" + res);
                    
            }   

            cont++;
        }
    }
}
