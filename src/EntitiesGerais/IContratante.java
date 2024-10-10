package EntitiesGerais;
import java.util.List;


public interface IContratante {
    public void demitir(Funcionario funcionario);
    public void demitir(List<Funcionario> funcionario);
    public void contratar(Funcionario funcionario);
    public void contratar(List<Funcionario> funcionario);

}
