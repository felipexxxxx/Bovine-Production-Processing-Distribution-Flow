package EntitiesAcougue;
import Exceptions.ContratoInvalidoException;
import EntitiesGerais.Funcionario;
import EntitiesGerais.IContratante;
import EntitiesGerais.Pessoa;

import java.util.List;
import java.util.ArrayList;

public class DonoAcougue extends Pessoa implements IContratante {
    private List<FuncionarioAcougue> funcionarios = new ArrayList<>();

    public DonoAcougue(String nome, int idade, String CPF, String telefone, List<FuncionarioAcougue> funcionarios){
        super(nome, idade, CPF, telefone);
        this.funcionarios = funcionarios;
    }

    @Override
    public void contratar(Funcionario funcionario) throws ContratoInvalidoException{
        if(funcionario instanceof FuncionarioAcougue){
            FuncionarioAcougue funcAux = (FuncionarioAcougue) funcionario;
            funcionarios.add(funcAux);
        } else{
            throw new ContratoInvalidoException("Operação inválida. Funcionário não qualificado!");
        }
    }
    @Override
    public void contratar(List<Funcionario> funcionario) throws ContratoInvalidoException{
        for(int i=0;i<funcionario.size();i++){
            if(funcionario instanceof FuncionarioAcougue){
                FuncionarioAcougue funcAux = (FuncionarioAcougue) funcionario;
                funcionarios.add(funcAux);
            } else{
                throw new ContratoInvalidoException("Operação inválida. Funcionário não qualificado!");
            }
        }
    }


    @Override
    public void demitir(Funcionario funcionarioAcougue) throws ContratoInvalidoException{
        if (funcionarios.contains(funcionarioAcougue)) {
            System.out.println("Funcionário "+funcionarioAcougue.getNome()+" demitido com sucesso");
            funcionarios.remove(funcionarioAcougue);
        } else {
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

     public String getFuncionarios(){
        for(int i = 0 ; i < funcionarios.size(); i++){
            if(i+1 == funcionarios.size()){
                System.out.println(funcionarios.get(i).getNome()+".");
            }else{
                System.out.println(funcionarios.get(i).getNome()+", ");
            }
            
        }
        return null;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+ "\nLista de funcionários: \n"+ funcionarios;
    }


}
