
public class IdadePessoa {
    private int ano;
    private int idade;

    public IdadePessoa() {
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade (int ano, int idade) {
        setAno (ano);
        setIdade (idade);
    }
    
    public void mostrarIdade(){
        System.out.println("Resultado: " + getIdade());
    }
}
