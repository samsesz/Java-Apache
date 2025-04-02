
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Loja dados1 = new Loja ();
        
        System.out.println("Razão Social: ");
        String razaoSocial = teclado.nextLine();
        System.out.println("Cpf Cliente: ");
        String cpfCliente = teclado.nextLine();
        System.out.println("Valor da compra: ");
        double valorCompra = teclado.nextDouble();
        System.out.println("Quantidade de itens: ");
        double qtdItensComp = teclado.nextDouble();
        System.out.println("Valor total da compra: ");
        
        System.out.println("O valor total e: ");
        double valorTotalCompra = valorCompra * qtdItensComp;
        
        dados1.inserirDados(razaoSocial, cpfCliente, valorCompra, qtdItensComp, valorTotalCompra);
        dados1.mostrarDadosLoja();
        dados1.calcularCompraLoja();
        
        teclado.close();
    }
    
}
