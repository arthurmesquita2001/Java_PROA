package desvio_condicional;

import java.util.Scanner;

/**
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
//ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
//morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
@author Arthur Mesquita Rocha
 */

public class Ex37 {
    public static void main(String[] args) {
        Fruits_value();
    }
    public static void Fruits_value(){
        Scanner buffer= new Scanner(System.in);

        double mac,mog,res,res_mog,res_mac;
        

        System.out.println("Peso das macas");
        mac=buffer.nextDouble();
        
        System.out.println("Peso dos morangos ");
        mog=buffer.nextDouble();
        
        if(mog<5){
            res_mog=mog*2.5;
        }else{
            res_mog=mog*2.2;
        }
        if(mac<5){
            res_mac=mac*1.8;
        }else{
            res_mac=mac*1.5;
        }

        res=res_mac+res_mog;

        if((mac+mog>8)||(res>25)){
            System.out.println("R$ "+(res*0.9));
        }
        else{
            System.out.println("R$ "+res);
        }
    }

    
}
