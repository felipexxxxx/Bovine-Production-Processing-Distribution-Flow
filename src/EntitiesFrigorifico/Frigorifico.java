package EntitiesFrigorifico;

import java.util.ArrayList;
import java.util.List;

import EntitiesAcougue.Acougue;
import EntitiesFazenda.Boi;

public class Frigorifico implements EntitiesGerais.IProdutos, EntitiesGerais.ICliente{
    // vender: 52% do peso do boi é aproveitado.
    // matar boi transforma o boi em carne
    //QUANDO VENDER A CARNE, COLOCAR OS CALCULAR SALARIO NO FINAL DESSE METODO
    //Funcionario: dos 52% por boi*0.1
    //Gerente ganha 20% da venda total
    //upervisor ganha 10% da venda
    private List<Boi> boisVivos = new ArrayList<>();
    private double carneDisponivel;
    private double lucroTotal;
    private Diretor diretorFrigorifico;
    

    public Frigorifico(Diretor diretorFrigorifico) {
        this.diretorFrigorifico = diretorFrigorifico;
    }
    @Override
    public void comprar(Boi boi){
        if(lucroTotal < 4500){
            System.out.println("boi comprado:\n"+ boi.getNumeracao());
            boisVivos.add(boi);
        }  else{
            System.out.println("boi comprado:\n"+ boi.getNumeracao());
            lucroTotal -= 4500;
            boisVivos.add(boi);
        }
        
    }
    
    public void matarBoi(FuncionarioFrigorifico funcionario, Boi boi){
        if(boisVivos.contains(boi)){
            System.out.println("Boi de numeração "+ boi.getNumeracao()+ " foi transformado em carne.");
            carneDisponivel += boi.getPeso()*0.52;
            boisVivos.remove(boi);
            funcionario.calcularSalario(boi);
        }
            
    }

    @Override
    public void vender() {
        double lucroVenda = 25 * carneDisponivel;
        System.out.println("Foram vendido "+ carneDisponivel + " quilos de carne, totalizando R$" + lucroVenda);
        lucroTotal += lucroVenda;
        carneDisponivel = 0;
        System.out.println("Lucro total: R$ " + lucroTotal);
        for(int i = 0; i < diretorFrigorifico.funcionarios.size(); i++){
            if(diretorFrigorifico.funcionarios.get(i)instanceof Gerente){
                Gerente aux = (Gerente) diretorFrigorifico.funcionarios.get(i);
                aux.calcularSalario(lucroVenda);
            } else if(diretorFrigorifico.funcionarios.get(i) instanceof Supervisor){
                Supervisor aux = (Supervisor) diretorFrigorifico.funcionarios.get(i);
                aux.calcularSalario(lucroVenda);
            }
        }
    }

    @Override
    public void vender(Boi boi) {}
    public void comprar(){}
    public void comprar(Frigorifico frigorifico){}
    public void vender(Double quilosVendidos){};
    public void comprar(Acougue acougue, double carneComprada){}    
    
    public List<Boi> getBoisVivos() {
        return boisVivos;
    }

    public double getCarneDisponivel() {
        return carneDisponivel;
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    public Diretor getDiretorFrigorifico() {
        return diretorFrigorifico;
    }

    @Override
    public void vender(double quilosVendidos) {}

    @Override
    public String toString() {
        return  "\n--------------------------" +"\nFrigorífico do diretor:" + diretorFrigorifico.getNome() + "\nlucroTotal: " + lucroTotal
                + "\nCarne disponível: "+ carneDisponivel+ "\n--------------------------";
    }
    
    

}
