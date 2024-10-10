package EntitiesAcougue;

public class FuncionarioAcougue extends EntitiesGerais.Funcionario{
    protected double salarioFixo;

    public FuncionarioAcougue(String nome, int idade, String CPF, String telefone) {
        super(nome, idade, CPF, telefone);
        salarioFixo = 1800;
        super.cargaHoraria=8;
        calcularFerias();
        calcularSalario();
    }

    @Override
    public void calcularFerias() {
        super.cargaHoraria = 30 +(cargaHoraria*1);
        
    }

    public void calcularSalario() {
        super.salario = salarioFixo;
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nTrabalho: Funcionário do Açougue" + "\n--------------------------";
    }
    
}
