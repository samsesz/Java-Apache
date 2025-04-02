
import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        IdadePessoa idad = new IdadePessoa();
        
        System.out.println("Digite o ano em que voce nasceu: ");
        int ano = teclado.nextInt();
        
        int idade = 2025 - ano;
        
        idad.calcularIdade(ano, idade);
        idad.mostrarIdade();
        
        teclado.close();
        
    }
    
}
