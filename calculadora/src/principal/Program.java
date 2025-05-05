
package principal;

import calc.OperacoesBasicas;
import javax.swing.JOptionPane;



public class Program {

    
    public static void main(String[] args) {
        OperacoesBasicas calc = new OperacoesBasicas();
        
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação desejada: \n 1 - Somar \n 2 - subtrair \n 3 - multiplicar \n 4 - dividir \n 0 - Sair \n"));
        double n1;
        double n2;
        double result;
        
        while (operacao != 0){
         switch (operacao){
            
            case 1:
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                result = calc.somar(n1, n2);
                JOptionPane.showMessageDialog(null, "resultado da soma: " + result);
                break;
            case 2: 
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                result = calc.sub(n1, n2);
                JOptionPane.showMessageDialog(null, "resultado da subtração: " + result);
                break;
            case 3:
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                result = calc.mult(n1, n2);
                JOptionPane.showMessageDialog(null, "resultado da multiplicacao: " + result);
                break;
            case 4:
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                result = calc.div(n1, n2);
                JOptionPane.showMessageDialog(null, "resultado da divisao: " + result);
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Fechando o programa");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
           }   
         operacao = Integer.parseInt(JOptionPane.showInputDialog( "Digite a operação desejada: \n 1 - Somar \n 2 - subtrair \n 3 - multiplicar \n 4 - dividir \n 0 - Sair \n"));
        }
    }
    
}
