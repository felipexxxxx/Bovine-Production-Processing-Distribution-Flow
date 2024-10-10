package EntitiesGerais;


public abstract class Funcionario extends Pessoa {
    protected double salario;
    protected int cargaHoraria;
    protected double diasFerias;

    public Funcionario(String nome, int idade, String CPF, String telefone) {
        super(nome, idade, CPF, telefone);
    }
    
    // 8HORAS POR DIA = 30 DIAS DE FERIAS
    // FAZER REGRA DE 3 PARA CALCULAR AS FERIAS, E QUANDO DE FERIAS, O FUNCIONARIO
    // VAI RECEBER O SEU SALARIO + 1/3 DEL
    protected abstract void calcularSalario();

    protected abstract void calcularFerias();

    public double getSalario() {
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getDiasFerias() {
        return diasFerias;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + salario + "\nCarga horária: " + cargaHoraria
                + "\nDias de ferias disponíveis: " + diasFerias;
    }
}
