
package application;

import java.util.Scanner;



public class Program {


    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite seu salario atual: ");
        float salario = entrada.nextFloat();
        
        
        System.out.println("Digite o percentual de reajuste: ");
        float reajuste = entrada.nextFloat();
        
        float novoSalario = salario + (salario * reajuste / 100);
        System.out.println("Seu novo salario e:" + novoSalario );
        
        
        
    }
    
}
