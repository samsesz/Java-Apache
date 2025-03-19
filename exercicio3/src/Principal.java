
import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Fornecedor for1 = new Fornecedor();
        
        System.out.println("Nome fornecedor: ");
        String nomeFor = teclado.nextLine();
        System.out.println("Nome produto: ");
        String nomeProd = teclado.nextLine();
        System.out.println("descricao: ");
        String descricao = teclado.nextLine();
        
        for1.cadastrarFornecedor(nomeFor, nomeProd, descricao);
        for1.listarFornecedor();
        
        teclado.close();
    }
}
