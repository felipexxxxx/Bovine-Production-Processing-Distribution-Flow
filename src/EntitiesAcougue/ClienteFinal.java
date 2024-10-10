package EntitiesAcougue;


import EntitiesFazenda.Boi;
import EntitiesFrigorifico.Frigorifico;

import java.io.FileWriter;
import EntitiesGerais.Pessoa;
import java.io.IOException;
import EntitiesGerais.Auxiliar;
import Exceptions.DadoInvalidoException;

public class ClienteFinal extends Pessoa implements EntitiesGerais.ICliente{
    private double saldo; // exception de sem saldo
    private double carneComprada;
    

    public ClienteFinal(String nome, int idade, String CPF, String telefone, double saldo) throws IOException{
        super(nome, idade, CPF, telefone);
        this.saldo = saldo;
        carneComprada = 0;

        String path = "TrabalhoFinal/Files/saldoCliente"+ getNome()+".txt";
        Auxiliar.criarArquivo(path);
        try{
            FileWriter fw = new FileWriter(path, false);
            fw.write("Saldo inicial: " + saldo);
            fw.close();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
    



    @Override
    public void comprar(Boi boi){}

    @Override
    public void comprar(Frigorifico frigorifico){}


    @Override
    public void comprar(Acougue acougue, double carneComprada){
        double dinheiroGasto = carneComprada*45;
        if(saldo > dinheiroGasto){
            this.carneComprada += carneComprada;
            acougue.vender(carneComprada);
            //Carne comprada em quilos
            
            System.out.println(carneComprada+"KG de carne foram comprados com sucesso!");
            atualizarSaldo(dinheiroGasto);
        } else{
            throw new DadoInvalidoException("Saldo insuficiente!");
        }
    }


    public void atualizarSaldo(double dinheiroGasto){
        
        String path = "TrabalhoFinal/Files/saldoCliente"+ getNome()+ ".txt";
        Auxiliar.criarArquivo(path);
        saldo -= dinheiroGasto;
        try{
            FileWriter fw = new FileWriter(path, true);
            fw.write("\nForam enviados R$"+dinheiroGasto+" para o acougue.");
            fw.write("\nSeu saldo atual: R$"+ saldo +".");
            fw.close();
        }catch(IOException ie){
            ie.printStackTrace();
        }    
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
