package vendas;
import javax.swing.JOptionPane;


public class Vendedor {
private String nome;
private double salarioBase;
private double valorVendido;
private double novoSalario;

    public Vendedor() {
    }

    public Vendedor(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public void cadastrarSalarioBase(){
        setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario base")));
    }
    
    public void cadastrarNome(){
        String n =JOptionPane.showInputDialog("Digite seu nome: ");
        
        setNome(n);
    }
    
    public void cadastrarValorVendido(){
        setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido: ")));
    }
    
    public double calculoComissao(double valorVendido){
        this.setNovoSalario(((valorVendido*10)/100)+ this.getSalarioBase());
        
        return this.salarioBase;
    }
}
