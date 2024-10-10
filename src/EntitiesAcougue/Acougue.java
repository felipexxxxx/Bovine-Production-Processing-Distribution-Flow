package EntitiesAcougue;
import EntitiesFazenda.Boi;
import EntitiesFrigorifico.Frigorifico;
import Exceptions.DadoInvalidoException;

public class Acougue implements EntitiesGerais.IProdutos, EntitiesGerais.ICliente{
    private DonoAcougue dono;
    private double carneDisponivel;
    private double lucroTotal;

    public Acougue(DonoAcougue dono) {
        this.dono = dono;
    }
    public void cortarCarne(){
        System.out.println("A carne foi cortada!");
    }
    

    @Override
    public void vender(double quilosVendidos) throws DadoInvalidoException{
        cortarCarne();
        if(quilosVendidos < carneDisponivel){
            lucroTotal += quilosVendidos * 45;
            carneDisponivel -= quilosVendidos;
        } else{
            throw new DadoInvalidoException("Carne em estoque insuficiente!");
        }
    }

    @Override
    public void comprar(Boi boi) {}

    @Override
    public void vender(Boi boi) {}
    
    @Override
    public void comprar(Acougue acougue, double carneComprada) {

    }
    @Override
    public void vender() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void comprar(Frigorifico frigorifico) {
        
        if(lucroTotal - 25* frigorifico.getCarneDisponivel() < 0){
            this.carneDisponivel = frigorifico.getCarneDisponivel();
        }else{
            this.carneDisponivel = frigorifico.getCarneDisponivel();
            lucroTotal -= 25* frigorifico.getCarneDisponivel();
        }
        
        frigorifico.vender();
        
    }

    @Override
    public String toString() {
        return "\n--------------------------" +"\nAçougue: " + dono.getNome() + 
        "\nlucroTotal: " + lucroTotal+ "\nCarne disponível: "+ carneDisponivel+ "\n--------------------------";
    }
}
