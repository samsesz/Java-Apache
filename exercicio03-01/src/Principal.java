

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira seu nome: ");
        double numeroConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o numero da conta: "));
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Insira seu saldo: "));
        
        categoriaCliente cli = new categoriaCliente(nome, numeroConta, saldoMedio);
        cli.verificarSaldo();         
    }
    
}
