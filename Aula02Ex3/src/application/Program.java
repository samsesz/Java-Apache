
package application;

import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o 1o numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o 2o numero: ");
        int num2 = teclado.nextInt();
        
        System.out.println("O dobro do primeiro numero e:" + (num1 * 2));
        System.out.println("O triplo do segundo numero e:" + (num2 * 3));
        
        teclado.close();
        
        
        
        
                
        
        
        
        
        
        
    }
    
}
