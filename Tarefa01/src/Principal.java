
import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Multiplicacao mult = new Multiplicacao ();
        
        System.out.println("Digite o numero a ser multiplicado por 4: ");
        int valor = teclado.nextInt();
        
        int resultado = valor * 4;
        
        mult.multiplicacao4(valor, resultado);
        mult.mostrarMultiplicacao();
        
        teclado.close();
    }
    
}
