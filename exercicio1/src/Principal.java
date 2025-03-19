
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Nome: ");
        String nomePa = teclado.next();
        System.out.println("RG: ");
        String rg = teclado.next();
        System.out.println("Telefone: ");
        String telefone = teclado.next();
        
        usuario1.cadastrarUsuario(nomePa, telefone, rg);
        usuario1.mostrarUsuario();
        usuario1.cadastrarViagem("maranhao", "12/12/2334", "13:45", "14C");
        usuario1.mostrarViagem();
        
        teclado.close();
    }
    
}
