package EntitiesFazenda;

import Exceptions.BoiErradoException;
import java.util.List;
import java.util.ArrayList;


public class FuncionarioFazenda extends EntitiesGerais.Funcionario {
    protected int boiCriado;
    protected double salarioFixo;
    protected int pesoBois;
    protected List<Boi> boisFuncionario = new ArrayList<>();


    public FuncionarioFazenda(String nome, int idade, String CPF, String telefone) {
        super(nome, idade, CPF, telefone);
        salarioFixo = 2000;
        super.cargaHoraria = 12;
        calcularFerias();
    }
    

    @Override
    public void calcularSalario() {
        super.salario = salarioFixo + (boiCriado * 300) + (0.2 * pesoBois);
    }

    @Override
    public void calcularFerias() {
        super.diasFerias = 30 +(cargaHoraria * 1);
    }

    public void criarBoi(List<Boi>  bois) {
        boiCriado += bois.size();
        for (int i = 0; i < bois.size(); i++) {
            boisFuncionario.add(bois.get(i));
            pesoBois += bois.get(i).getPeso();
        }
        calcularSalario();
    }

    public void removerBoi(Boi boi) { 
        if (boisFuncionario.contains(boi)) {
            boisFuncionario.remove(boi);
            boiCriado -= 1; 
        }
    }

    public int getBoiCriado() {
        return boiCriado;
    }

    public int getPesoBois() {
        return pesoBois;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTrabalho: Funcionário da fazenda" + "\nQuantidade de bois criados: " + boiCriado
                + "\n--------------------------";
    }

    public void alimentarBoi(Boi boi) {
        if (boisFuncionario.contains(boi)) {
            boi.comer();
        } else {
            throw new BoiErradoException("Este boi não pertence a esse funcionário.");
        }
    }
    // try caso o boi n esteja em bois criados -> erro;
}
