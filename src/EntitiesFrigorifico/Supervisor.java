package EntitiesFrigorifico;

public class Supervisor extends EntitiesGerais.Funcionario{
    private double salarioFixo;
    public Supervisor(String nome, int idade, String CPF, String telefone) {
        super(nome, idade, CPF, telefone);
        salarioFixo = 4000;
        super.cargaHoraria = 8;
        calcularFerias();
    }
     @Override
    public void calcularFerias() {
        super.diasFerias = 30 + (cargaHoraria *1);
    }
    public void calcularSalario(double lucroVenda) {
        super.salario = salarioFixo + 0.1*lucroVenda;
    }
@Override
     public void calcularSalario(){}


@Override
public String toString() {
    return super.toString() + "\nTrabalho: Supervisor do Frigorífico" + "\n--------------------------";
}

}
