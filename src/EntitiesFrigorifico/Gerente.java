package EntitiesFrigorifico;

public class Gerente extends EntitiesGerais.Funcionario {
    private double salarioFixo;
    public Gerente(String nome, int idade, String CPF, String telefone) {
        super(nome, idade, CPF, telefone);
        salarioFixo = 7000;
        super.cargaHoraria = 6;
        calcularFerias();
    }

    public void calcularSalario(double lucroVenda){
        super.salario = salarioFixo+ 0.2*lucroVenda;
    }


     @Override
    public void calcularFerias() {
        super.diasFerias = 30 + (cargaHoraria*1);
    }
    @Override
     public void calcularSalario(){}

    @Override
    public String toString() {
        return super.toString() + "\nTrabalho: Gerente do Frigorífico" + "\n--------------------------";
    }
    
}
