
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Quadrado quad = new Quadrado ();
        
        System.out.println("Digite o numero a ser elevado ao quadrado: ");
        double numero = teclado.nextDouble();
        
        double resultado = numero * numero;
        
        quad.calcularQuadrado(numero, resultado);
        quad.mostrarQuadrado();
        
        teclado.close();
    }
    
}
