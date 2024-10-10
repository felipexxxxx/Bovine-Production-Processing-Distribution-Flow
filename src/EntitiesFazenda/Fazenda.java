package EntitiesFazenda;

public class Fazenda implements EntitiesGerais.IProdutos {
    private DonoFazenda dono;
    private double lucroTotal;

    public Fazenda(DonoFazenda dono1) {
        this.dono = dono1;
    }

    // Frigorifico comprador;
    // despesa
    // lucro
    // vender pro frigotifico
    @Override
    public void vender(Boi boi) {
        for (int i = 0; i < dono.funcionarios.size(); i++) {
            if (dono.funcionarios.get(i).boisFuncionario.contains(boi)) {
                dono.funcionarios.get(i).removerBoi(boi);
                lucroTotal += 4500;
                System.out.println("A fazenda lucrou 4.500 com o boi de numeração " + boi.getNumeracao());
            }
        }

    }
    @Override
    public void vender(){}
    public void vender(double quilosVendidos){};  
        
    public DonoFazenda getDono() {
        return dono;
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    @Override
    public String toString() {
        return "\n--------------------------" + "\nFazenda de dono:" + dono.getNome() + "\nlucroTotal: " + lucroTotal
                + "\n--------------------------";
    }

}
