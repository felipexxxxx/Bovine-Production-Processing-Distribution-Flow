package EntitiesGerais;

import EntitiesFazenda.Boi;
import EntitiesFrigorifico.Frigorifico;
import EntitiesAcougue.Acougue;

public interface ICliente {
    public void comprar(Boi boi);
    public void comprar(Frigorifico frigorifico);
    public void comprar(Acougue acougue, double carneComprada);
}
