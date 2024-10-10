package EntitiesFrigorifico;

import EntitiesFazenda.Boi;

public class FuncionarioFrigorifico extends EntitiesGerais.Funcionario {

    private double salarioFixo;

    public FuncionarioFrigorifico(String nome, int idade, String CPF, String telefone) {
        super(nome, idade, CPF, telefone);
        salarioFixo = 2000;
        super.cargaHoraria = 10;
        calcularFerias();
    }

    @Override
    public void calcularFerias() {
        super.diasFerias = 30 + (cargaHoraria * 1);
    }

    @Override
    public void calcularSalario(){}
    
    
    public void calcularSalario(Boi boi) {
        super.salario = salarioFixo * (0.1 * (boi.getPeso() * 0.52));
    }

    @Override
    public String toString() {
        return super.toString() + "\nTrabalho: Funcionário do Frigorífico" + "\n--------------------------";
    }
    

}