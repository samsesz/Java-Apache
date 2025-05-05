package principal;
import javax.swing.JOptionPane;
import vendas.Vendedor;


public class Main {

 
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        int operacao;
        
        do {
            operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n 1 - Informar Nome \n 2- Informar Salario \n 3 - Informar Valor vendido \n 4 - Calcular comissao \n 0 - Sair "));
        
        if(operacao == 1){
            vendedor.cadastrarNome();
        }
        else if (operacao == 2){
            vendedor.cadastrarSalarioBase();
        }
        else if (operacao == 3){
            vendedor.cadastrarValorVendido();
        }
        else if (operacao == 4){
            vendedor.calculoComissao(vendedor.getValorVendido());
        
            JOptionPane.showMessageDialog(null, "O vendedor " + vendedor.getNome() + " teve salario final de " + vendedor.getNovoSalario());
        }
        
        } while (operacao != 0);
    }
    
}
