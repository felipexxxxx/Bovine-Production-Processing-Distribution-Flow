package EntitiesGerais;
import EntitiesFazenda.Boi;

public interface IProdutos {
//vender(cliente)
    public void vender(Boi boi);
    public void vender();
    public void vender(double quilosVendidos);
}
