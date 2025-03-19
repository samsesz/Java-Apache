
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Cliente cliente1 = new Cliente();
        
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Endereco: ");
        String end = teclado.nextLine();
        System.out.println("RG: ");
        String rg = teclado.nextLine();
        
        
        cliente1.cadastrarCliente(nome, end, rg);
        cliente1.listarCliente();
        
        teclado.close();
    }
    
}
