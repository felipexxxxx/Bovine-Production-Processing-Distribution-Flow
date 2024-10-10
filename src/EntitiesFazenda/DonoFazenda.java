package EntitiesFazenda;
import Exceptions.DadoInvalidoException;
import Exceptions.ContratoInvalidoException;


import java.util.List;
import java.util.ArrayList;
import EntitiesGerais.Funcionario;
import EntitiesGerais.IContratante;

public class DonoFazenda extends EntitiesGerais.Pessoa implements IContratante{

    protected List<FuncionarioFazenda> funcionarios = new ArrayList<>();

    public DonoFazenda(String nome, int idade, String CPF, String telefone, List<FuncionarioFazenda> funcionarios) throws DadoInvalidoException{
        super(nome, idade, CPF, telefone);
        this.funcionarios = funcionarios;
    }
    
    @Override
    public void demitir(Funcionario funcionarioFazenda)throws ContratoInvalidoException{
        if (funcionarios.contains(funcionarioFazenda)) {
            System.out.println("Funcionário "+funcionarioFazenda.getNome()+" demitido com sucesso");
            funcionarios.remove(funcionarioFazenda);
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


    @Override
    public void contratar(Funcionario funcionarioFazenda) throws ContratoInvalidoException{
        if(funcionarioFazenda instanceof FuncionarioFazenda){
            FuncionarioFazenda funcAux = (FuncionarioFazenda) funcionarioFazenda;
            funcionarios.add(funcAux);
            System.out.println("Funcionário "+funcionarioFazenda.getNome()+" contratado com sucesso");
        } else{
            throw new ContratoInvalidoException("Operação inválida. Funcionário não qualificado!");
        }
        
    }
    @Override
    public void contratar(List<Funcionario> funcionario) throws ContratoInvalidoException{
        for(int i=0;i<funcionario.size();i++){
            if(funcionario instanceof FuncionarioFazenda){
                FuncionarioFazenda funcAux = (FuncionarioFazenda) funcionario;
                funcionarios.add(funcAux);
            } else{
                throw new ContratoInvalidoException("Operação inválida. Funcionário não qualificado!");
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

