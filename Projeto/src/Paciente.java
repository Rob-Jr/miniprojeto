
public class Paciente {
    private String nome;
    private int cpf;
    private int idade;
    private int dataNas;
    private String email;
    private int telefone;
    private String rua;
    private String bairro;
    private String complemento;
    private int numCas;
    
    public Paciente(String nome, int cpf, int idade, int dataNas, String email, int telefone, String rua, String bairro, String complemento, int numCas){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNas = dataNas;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numCas = numCas;
    }

    public int getNumCas() {
        return numCas;
    }
    public void setNumCas(int numCas) {
        this.numCas = numCas;
    }
    public int getDataNas() {
        return dataNas;
    }
    public void setDataNas(int dataNas) {
        this.dataNas = dataNas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    

}
