package EntitiesFazenda;


public class Boi extends EntitiesGerais.Animal {

    public Boi(int idade, int numeracao, int pesoQuilos) {
        super(idade, numeracao, pesoQuilos);
    }

    @Override
    public void comer() {
        System.out.println("O boi se alimentou!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
