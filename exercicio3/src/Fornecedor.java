
public class Fornecedor {
private String nomeFor;
private String nomeProd;
private String descricao;

    public Fornecedor() {
    }


    public Fornecedor(String nomeFor, String nomeProd, String descricao) {
        this.nomeFor = nomeFor;
        this.nomeProd = nomeProd;
        this.descricao = descricao;
    }

    public String getNomeFor() {
        return nomeFor;
    }

    public void setNomeFor(String nomeFor) {
        this.nomeFor = nomeFor;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void cadastrarFornecedor(String nomeFor, String nomeProd, String descricao){
        setNomeFor (nomeFor);
        setNomeProd (nomeProd);
        setDescricao (descricao);
    }
    
    public void listarFornecedor(){
        System.out.println("Dados do cliente");
        System.out.println("Nome fornecedor: " + getNomeFor());
        System.out.println("Nome produto: " + getNomeProd());
        System.out.println("descricao: " + getDescricao());
    }

}
