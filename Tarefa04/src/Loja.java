
public class Loja {
private String razaoSocial;
private String cpfCliente;
private double valorCompra;
private double qtdItensComp;
private double valorTotalCompra;

    public Loja() {
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public void inserirDados (String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra){
        setRazaoSocial(razaoSocial);
        setCpfCliente (cpfCliente);
        setValorCompra (valorCompra);
        setQtdItensComp (qtdItensComp);
        setValorTotalCompra (valorTotalCompra);
    }
    
    public void mostrarDadosLoja (){
        System.out.println("Dados da loja");
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("Cpf Cliente: " + getCpfCliente());
        System.out.println("Valor da compra: " + getValorCompra());
        System.out.println("Quantidade de itens: " + getQtdItensComp());
        System.out.println("Valor total da compra: " + getValorTotalCompra());
    }
    
    public void calcularCompraLoja () {
        setValorCompra (valorCompra);
        setQtdItensComp (qtdItensComp);
        setValorTotalCompra (valorTotalCompra);
    }

}
