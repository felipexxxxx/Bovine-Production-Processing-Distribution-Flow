package EntitiesFrigorifico;
import Exceptions.ContratoInvalidoException;
import Exceptions.DadoInvalidoException;
import java.util.List;
import java.util.ArrayList;
import EntitiesGerais.Funcionario;
import EntitiesGerais.IContratante;



public class Diretor extends Funcionario implements IContratante{
    protected List<Funcionario> funcionarios = new ArrayList<>();
    private double salarioFixo;

    public Diretor(String nome, int idade, String CPF, String telefone, List<Funcionario> funcionarios) throws DadoInvalidoException{
        super(nome, idade, CPF, telefone);
        this.funcionarios = funcionarios;
        salarioFixo = 20000;
        super.cargaHoraria = 6;
        calcularFerias();
        calcularSalario();
    }
    @Override
    public void calcularFerias() {
        super.diasFerias = 30 + (cargaHoraria * 1.5);
    }
        
    @Override
    public void calcularSalario() {
        super.salario = salarioFixo;
    }
     @Override
    public void contratar(Funcionario funcionario) throws ContratoInvalidoException{
        if(funcionario instanceof Gerente){
            Gerente funcAux = (Gerente) funcionario;
            funcionarios.add(funcAux);
        } else if(funcionario instanceof Supervisor){
            Supervisor funcAux = (Supervisor) funcionario;
            funcionarios.add(funcAux);
        } else if(funcionario instanceof FuncionarioFrigorifico){
             FuncionarioFrigorifico funcAux = (FuncionarioFrigorifico) funcionario;
            funcionarios.add(funcAux);
        } else{
            throw new ContratoInvalidoException("Operação inválida. Funcionário não qualificado!");
        }
        }

        public void contratar(List<Funcionario> funcionario) throws ContratoInvalidoException{
        for(int i=0;i<funcionario.size();i++){
            if(funcionario instanceof Gerente){
                Gerente funcAux = (Gerente) funcionario;
                funcionarios.add(funcAux);
            } else if(funcionario instanceof Supervisor){
                Supervisor funcAux = (Supervisor) funcionario;
                funcionarios.add(funcAux);
            } else if(funcionario instanceof FuncionarioFrigorifico){
                FuncionarioFrigorifico funcAux = (FuncionarioFrigorifico) funcionario;
                funcionarios.add(funcAux);
            } else{
                throw new ContratoInvalidoException("Operação inválida. Funcionário não qualificado!");
            }
        }
        
    }

    @Override
    public void demitir(Funcionario funcionario) throws ContratoInvalidoException{
        if(funcionarios.contains(funcionario)){
            System.out.println("Funcionario "+funcionario.getNome()+" demitido com sucesso!");
            funcionarios.remove(funcionario);
        } else{
            throw new ContratoInvalidoException("Não foi possível realizar a ação. Funcionário não encontrado!");
        }
    }

    @Override
    public void demitir(List<Funcionario> funcionario) throws ContratoInvalidoException{
        for(int i = 0 ; i < funcionario.size(); i ++){
            if(funcionarios.contains(funcionario)){
                System.out.println("Funcionario "+funcionario.get(i).getNome()+" demitido com sucesso!");
                funcionarios.remove(funcionario);
            } else{
                throw new ContratoInvalidoException("Não foi possível realizar a ação. Funcionário não encontrado!");
            }
        }
    }
    @Override
    public String toString() {
        return super.toString()+ "\nLista de funcionários: \n"+ funcionarios;
    }
    
}
