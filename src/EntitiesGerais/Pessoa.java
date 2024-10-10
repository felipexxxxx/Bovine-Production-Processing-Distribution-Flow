package EntitiesGerais;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String CPF;
    protected String telefone;

    public Pessoa(String nome, int idade, String CPF, String telefone){

        Auxiliar.verificarDados(nome, idade, CPF, telefone);

        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "\n--------------------------" + "\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + CPF + "\nTelefone: "
                + telefone;
    }

}
