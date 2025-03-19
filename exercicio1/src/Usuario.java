
public class Usuario {
    private String nomePa; 
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String hora;
    private String poltrona;   

    public Usuario() {
    }

    public Usuario(String nomePa, String telefone, String rg, String localViagem, String data, String hora, String poltrona) {
        this.nomePa = nomePa;
        this.telefone = telefone;
        this.rg = rg;
        this.localViagem = localViagem;
        this.data = data;
        this.hora = hora;
        this.poltrona = poltrona;
    }

    public String getNomePa() {
        return nomePa;
    }

    public void setNomePa(String nomePa) {
        this.nomePa = nomePa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    
    public void cadastrarUsuario(String nomePa, String telefone, String rg){
        setNomePa (nomePa);
        setRg(rg);
        setTelefone(telefone);
    }
    
    public void cadastrarViagem(String localViagem, String data, String hora, String poltrona){
        setData(data);
        setHora(hora);
        setLocalViagem(localViagem);
        setPoltrona(poltrona);
    }
    
    public void mostrarUsuario (){
       System.out.println("Suas informacoes: " + "Nome: " + getNomePa() +  "\n" +
                "Telefone: " + getTelefone() + "\n" + "RG: " + getRg() );
    }
    
    public void mostrarViagem () {
        System.out.println ("Local da viagem: " + getLocalViagem() + "\n" +
                "Data: " + getData() + "\n" +
                "Hora: " + getHora() + "\n" +
                "Poltrona: " + getPoltrona() + "\n" );
    }
    
    public void Mensagem (){
        System.out.println("Suas informacoes: " + "Nome: " + getNomePa() +  "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "RG: " + getRg() + "\n" +
                "Local da viagem: " + getLocalViagem() + "\n" +
                "Data: " + getData() + "\n" +
                "Hora: " + getHora() + "\n" +
                "Poltrona: " + getPoltrona() + "\n" );
    }

}



