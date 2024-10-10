package EntitiesGerais;

public abstract class Animal {
    protected int idadeMeses;
    protected int numeracao;
    protected int pesoQuilos;

    public Animal(int idadeMeses, int numeracao, int pesoQuilos) {
        this.idadeMeses = idadeMeses;
        this.numeracao = numeracao;
        this.pesoQuilos = pesoQuilos;
    }

    public int getIdade() {
        return idadeMeses;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public int getPeso() {
        return pesoQuilos;
    }

    protected abstract void comer();

    @Override
    public String toString() {
        return "\nNumeração do boi: " + numeracao + "\nIdade do boi: " + idadeMeses
                + " meses" + "\nPeso do boi: " + pesoQuilos + " KG" + "\n--------------------------";
    }

}
