import EntitiesFazenda.FuncionarioFazenda;
import EntitiesFrigorifico.Diretor;
import EntitiesFrigorifico.Frigorifico;
import EntitiesFrigorifico.Gerente;
import EntitiesFrigorifico.Supervisor;
import EntitiesGerais.Auxiliar;
import EntitiesGerais.Funcionario;
import EntitiesFazenda.Boi;
import EntitiesFazenda.DonoFazenda;
import EntitiesFazenda.Fazenda;
import Exceptions.BoiErradoException;
import Exceptions.ContratoInvalidoException;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import EntitiesAcougue.ClienteFinal;
import EntitiesAcougue.DonoAcougue;
import EntitiesAcougue.FuncionarioAcougue;
import EntitiesAcougue.Acougue;
import EntitiesFrigorifico.FuncionarioFrigorifico;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {

        //LER ARQUIVO COM LISTA DE BOIS:
        String pathBois = "TrabalhoFinal/Files/listaBois.txt";
        File fileBois = new File(pathBois);
        Scanner sc = null;
        List<Integer> boisArquivo = new ArrayList<>();
        int numeroBois = 0;
        try{
            sc = new Scanner(fileBois);
            while(sc.hasNext()){
                numeroBois += 1;

                int idade = sc.nextInt();
                int numeracao = sc.nextInt();
                int peso = sc.nextInt();
                
                boisArquivo.add(idade);
                boisArquivo.add(numeracao);
                boisArquivo.add(peso);
            }
        }catch(FileNotFoundException e){
            Auxiliar.criarArquivo(pathBois);
        }


        //CRIAR BOIS CONFORME ARQUIVO
        Boi boi1 = new Boi(boisArquivo.get(0), boisArquivo.get(1), boisArquivo.get(2));
        Boi boi2 = new Boi(boisArquivo.get(3), boisArquivo.get(4), boisArquivo.get(5));
        Boi boi3 = new Boi(boisArquivo.get(6), boisArquivo.get(7), boisArquivo.get(8));
        List<Boi> listaBois = new ArrayList<Boi>();
        listaBois.add(boi1);
        listaBois.add(boi2);
        listaBois.add(boi3);
  





        int aux = 0;
        Scanner scSwitch = new Scanner(System.in);
        List<FuncionarioFazenda> listaFuncionariosFazenda = new ArrayList<>();
        List<DonoFazenda> listaDonosFazenda = new ArrayList<>();
        List<Fazenda> listaFazendas = new ArrayList<>();

        List<Funcionario> listaFuncionariosFrigorifico = new ArrayList<>();
        List<Diretor> listaDiretorFrigorifico= new ArrayList<>();
        List<Frigorifico> listaFrigorificos = new ArrayList<>();

        List<FuncionarioAcougue> listaFuncionariosAcougue = new ArrayList<>();
        List<DonoAcougue> listaDonosAcougue = new ArrayList<>();
        List<Acougue> listaAcougues = new ArrayList<>();

         List<ClienteFinal> listaClientesFinais = new ArrayList<>();

        while (aux != 1){
            try{
                System.out.println("\nEscolha o processo a ser mostrado: "+
                                    "\n1. Fazenda"+
                                    "\n2. Frigorífico"+
                                    "\n3. Açougue"+
                                    "\n4. Cliente final"+
                                    "\n5. Sair");

                int escolha1 = scSwitch.nextInt();
                switch (escolha1) {
                    case 1:
                        while(aux != 2){
                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                    "\n1. Boi"+
                                    "\n2. Funcionário"+
                                    "\n3. Dono da fazenda"+
                                    "\n4. Fazenda"+
                                    "\n5. Voltar");

                            int escolha2 = scSwitch.nextInt();
                            switch (escolha2) {
                                case 1:
                                    
                                    System.out.println("\nEscolha o processo a ser mostrado: "+
                                        "\n1. Ver informações sobre os bois."+
                                        "\n2. Voltar.");
                                    int escolha3 = scSwitch.nextInt();
                                    switch (escolha3) {
                                        case 1:
                                        System.out.println(boi1.toString());
                                        System.out.println(boi2.toString());
                                        System.out.println(boi3.toString());
                                    
                                        case 2:
                                        break;
                                    }
                                    

                        
                                break;
                                case 2:
                                    while(aux != 4){
                                    if(listaFuncionariosFazenda.size() == 0){
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar funcionário.");
                                        int escolha4 = scSwitch.nextInt();
                                        int id = 0;
                                        switch (escolha4) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do funcionário.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do funcionário.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do funcionário.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do funcionário.");
                                                String telefone1 = scSwitch.next();

                                                listaFuncionariosFazenda.add(new FuncionarioFazenda(nome1, idade1, CPF1, telefone1));

                                                System.out.println("Funcionário cadastrado com sucesso.");

                                           
                                        
                                        }
                                    } else{
                                        int id = 0;
                                        
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar funcionário."+
                                            "\n2. Criar boi."+
                                            "\n3. Alimentar Boi."+
                                            "\n4. Dados de um funcionário"+
                                            "\n5. Voltar.");
                                        int escolha5 = scSwitch.nextInt();
                                        switch (escolha5) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do funcionário.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do funcionário.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do funcionário.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do funcionário.");
                                                String telefone1 = scSwitch.next();

                                                listaFuncionariosFazenda.add(new FuncionarioFazenda(nome1, idade1, CPF1, telefone1));

                                                System.out.println("Funcionário cadastrado com sucesso.");
                                                
                                                break;
                                        
                                            case 2:
                                                System.out.println("Digite o nome do funcionário que vai criar os bois.");
                                                scSwitch.nextLine();
                                                String nomeFunc1 = scSwitch.nextLine();
                                                for(int i = 0; i< listaFuncionariosFazenda.size(); i++){
                                                    if(listaFuncionariosFazenda.get(i).getNome().equals(nomeFunc1)){
                                                        listaFuncionariosFazenda.get(i).criarBoi(listaBois);
                                                        System.out.println("Bois cadastrados para o funcionário "+listaFuncionariosFazenda.get(i).getNome()+".");
                                                    }
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Digite o nome do funcionário que vai alimentar o boi."); 
                                                scSwitch.nextLine();
                                                String nomeFunc2 = scSwitch.nextLine();
                                                for(int i=0; i<listaFuncionariosFazenda.size();i++){
                                                    if(listaFuncionariosFazenda.get(i).getNome().equals(nomeFunc2)){
                                                        System.out.println("Digite a numeração do boi que vai ser alimentado pelo funcionário "+listaFuncionariosFazenda.get(i).getNome()+".");
                                                        int numBoi2 = scSwitch.nextInt();
                                                        for(int b= 0;b<listaBois.size();b++){
                                                            if(listaBois.get(b).getNumeracao()==numBoi2){
                                                                listaFuncionariosFazenda.get(i).alimentarBoi(listaBois.get(b));
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case 4:
                                                System.out.println(listaFuncionariosFazenda.toString());
                                                break;
                                            case 5:
                                             aux = 4;
                                             break;
                                        }

                                    }
                                }
                                break;

                                case 3:
                                while(aux != 5){
                                    if(listaDonosFazenda.size() == 0){
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar dono da fazenda."+
                                            "\n2. Voltar");
                                        int escolha6 = scSwitch.nextInt();
                                        int id = 0;
                                        switch (escolha6) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do dono da fazenda.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do dono da fazenda.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do dono da fazenda.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do dono da fazenda.");
                                                String telefone1 = scSwitch.next();
                                                System.out.println("Lista de funcionários passada com succeso.");

                                                listaDonosFazenda.add(new DonoFazenda(nome1, idade1, CPF1, telefone1, listaFuncionariosFazenda));

                                                System.out.println("Cadastro realizado com succeso.");
                                                break;
                                                
                                            case 2:
                                            aux = 5;
                                            break;
                    
                                        }
                                    } else{
                                        int id = 0;
                                        
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Demitir funcionário"+
                                            "\n2. Contratar funcionário"+
                                            "\n3. Dados do dono da fazenda"+
                                            "\n4. Voltar.");
                                        int escolha7 = scSwitch.nextInt();
                                        switch (escolha7) {
                                            case 1:
                                                System.out.println("Digite o nome do funcionário que será demitido.");
                                                scSwitch.nextLine();
                                                String nomeFunc1 = scSwitch.nextLine();

                                                for(int i = 0; i< listaFuncionariosFazenda.size(); i++){
                                                    if(listaFuncionariosFazenda.get(i).getNome().equals(nomeFunc1)){
                                                        listaDonosFazenda.get(0).demitir(listaFuncionariosFazenda.get(i));
                                                        
                                                    }
                                                }
                                        break;
                                            case 2:
                                                System.out.println("Digite o nome do funcionário que será contratado.");
                                                scSwitch.nextLine();
                                                String nomeFunc2 = scSwitch.nextLine();
                                                
                                                for(int a= 0; a< listaFuncionariosFazenda.size(); a++){
                                                    if(listaFuncionariosFazenda.get(a).getNome().equals(nomeFunc2)){
                                                        listaDonosFazenda.get(0).contratar(listaFuncionariosFazenda.get(a));
                                                    }
                                                }

                                                break;

                                            case 3:
                                                System.out.println(listaDonosFazenda.get(0).toString());
                                                break;
                                            case 4:
                                                aux = 5;
                                                break;
                                        }

                                    }
                                }
                                break;
                                case 4:
                                while(aux != 6){
                                    System.out.println("\nEscolha o processo a ser mostrado: "+
                                                        "\n1. Vender um boi."+
                                                        "\n2. Dados da fazenda."+
                                                        "\n3. Voltar");
                                    listaFazendas.add(new Fazenda(listaDonosFazenda.get(0)));
                                    int escolha8 = scSwitch.nextInt();
                                    switch (escolha8) {
                                        case 1:
                                            System.out.println("Digite o número do boi que vai ser vendido.");
                                            int numeroBoi3 = scSwitch.nextInt();
                                            for(int i = 0 ; i < listaBois.size(); i++){
                                                if(listaBois.get(i).getNumeracao() == numeroBoi3){
                                                    listaFazendas.get(0).vender(listaBois.get(i));
                                                }
                                            }
                                            break;
                                          
                                    
                                        case 2:
                                            System.out.println(listaFazendas.get(0).toString());
                                            break;
                                        case 3:
                                            aux = 6;
                                            break;
                                    }
                                }
                                break;
                            case 5:
                                aux = 2;
                                break;    
                        }
                    }
                    break;
////////////////////////////////////////////////FRIGORIFICO//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////FRIGORIFICO//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////FRIGORIFICO//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////FRIGORIFICO//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////FRIGORIFICO//////////////////////////////////////////////////////////////////
                    case 2:
                        while(aux != 7){
                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                    "\n1. Magarefe"+
                                    "\n2. Supervisor"+
                                    "\n3. Gerente"+
                                    "\n4. Diretor"+
                                    "\n5. Frigorífico"+
                                    "\n6. Voltar");

                            int escolha2 = scSwitch.nextInt();
                            switch (escolha2) {
                                case 1:    
                                    while(aux != 8){
                                        int id = 0;
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar magarefes."+
                                            "\n2. Voltar.");
                                        int escolha3 = scSwitch.nextInt();
                                        switch (escolha3) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do magarefe.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do magarefe.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do magarefe.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do magarefe.");
                                                String telefone1 = scSwitch.next();

                                                listaFuncionariosFrigorifico.add(new FuncionarioFrigorifico(nome1, idade1, CPF1, telefone1));

                                                System.out.println("Magarefes cadastrado com sucesso.");
                                                
                                                break;
                                        
                                            case 2:
                                            aux = 8;
                                            break;
                                        }
                                    }
                                    break;
                                
                                case 2:
                                    while(aux != 9){
                                        int id = 0;
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar supervisor."+
                                            "\n2. Voltar.");
                                        int escolha4 = scSwitch.nextInt();
                                        switch (escolha4) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do supervisor.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do supervisor.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do supervisor.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do supervisor.");
                                                String telefone1 = scSwitch.next();

                                                listaFuncionariosFrigorifico.add(new Supervisor(nome1, idade1, CPF1, telefone1));

                                                System.out.println("Supervisor cadastrado com sucesso.");
                                                
                                                break;
                                        
                                            case 2:
                                            aux = 9;
                                            break;
                                        }
                                    }
                                    break;
                                
                                case 3:
                                while(aux != 10){
                                        int id = 0;
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar gerente."+
                                            "\n2. Voltar.");
                                        int escolha5 = scSwitch.nextInt();
                                        switch (escolha5) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do gerente.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do gerente.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do gerente.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do gerente.");
                                                String telefone1 = scSwitch.next();

                                                listaFuncionariosFrigorifico.add(new Gerente(nome1, idade1, CPF1, telefone1));

                                                System.out.println("Gerente cadastrado com sucesso.");
                                                
                                                break;
                                        
                                            case 2:
                                            aux = 10;
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                while(aux !=11){
                                    if(listaDiretorFrigorifico.size() == 0){
                                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                                "\n1. Cadastrar diretor."+
                                                "\n2. Voltar");
                                            int escolha6 = scSwitch.nextInt();
                                            int id = 0;
                                            switch (escolha6) {
                                                case 1:
                                                    id = UUID.randomUUID().hashCode();

                                                    System.out.println("Digite o nome do diretor.");
                                                    scSwitch.nextLine();
                                                    String nome1 = scSwitch.nextLine();
                                                    System.out.println("Digite a idade do diretor.");
                                                    int idade1 = scSwitch.nextInt();
                                                    System.out.println("Digite o CPF do diretor.");
                                                    String CPF1 = scSwitch.next();
                                                    System.out.println("Digite o telefone do diretor.");
                                                    String telefone1 = scSwitch.next();
                                                    System.out.println("Lista de funcionários passada com succeso.");

                                                    listaDiretorFrigorifico.add(new Diretor(nome1, idade1, CPF1, telefone1, listaFuncionariosFrigorifico));

                                                    System.out.println("Cadastro realizado com succeso.");
                                                    break;
                                                    
                                                case 2:
                                                aux =11;
                                                break;
                        
                                            }
                                            break;
                                        } else{
                                            int id = 0;
                                            
                                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                                "\n1. Demitir funcionário"+
                                                "\n2. Contratar funcionário"+
                                                "\n3. Dados do diretor"+
                                                "\n4. Voltar.");
                                            int escolha7 = scSwitch.nextInt();
                                            switch (escolha7) {
                                                case 1:
                                                    System.out.println("Digite o nome do funcionário que será demitido.");
                                                    scSwitch.nextLine();
                                                    String nomeFunc1 = scSwitch.nextLine();

                                                    for(int i = 0; i< listaFuncionariosFrigorifico.size(); i++){
                                                        if(listaFuncionariosFrigorifico.get(i).getNome().equals(nomeFunc1)){
                                                            listaDiretorFrigorifico.get(0).demitir(listaFuncionariosFrigorifico.get(i));
                                                        }
                                                    }
                                                break;
                                                case 2:
                                                    System.out.println("Digite o nome do funcionário que será contratado.");
                                                    scSwitch.nextLine();
                                                    String nomeFunc2 = scSwitch.nextLine();
                                                    
                                                    for(int a= 0; a< listaFuncionariosFrigorifico.size(); a++){
                                                        if(listaFuncionariosFrigorifico.get(a).getNome().equals(nomeFunc2)){
                                                            listaDiretorFrigorifico.get(0).contratar(listaFuncionariosFrigorifico.get(a));
                                                        }
                                                    }

                                                    break;

                                                case 3:
                                                    System.out.println(listaDiretorFrigorifico.get(0).toString());
                                                    break;
                                                case 4:
                                                    aux = 11;
                                                    break;
                                            }
                                        break;
                                        }
                                    
                                }
                                break;
                                case 5:
                                while(aux != 12){
                                    System.out.println("\nEscolha o processo a ser mostrado: "+
                                                        "\n1. Comprar boi"+
                                                        "\n2. Matar boi"+
                                                        "\n3. Dados do frigorífico"+
                                                        "\n4. Voltar");
                                    listaFrigorificos.add(new Frigorifico(listaDiretorFrigorifico.get(0)));
                                    int escolha8 = scSwitch.nextInt();
                                    switch (escolha8) {
                                        case 1:
                                            System.out.println("Digite o número do boi que vai ser comprado.");
                                            int numeroboi3 = scSwitch.nextInt();
                                            for(int i = 0 ; i < listaBois.size(); i++){
                                                if(listaBois.get(i).getNumeracao() == numeroboi3){
                                                    listaFrigorificos.get(0).comprar((listaBois.get(i)));
                                                    System.out.println("O boi foi comprado com sucesso!");
                                                }
                                            }
                                            break;
                                          
                                    
                                        case 2:
                                            System.out.println("Digite o nome do magarefe que vai matar o boi.");
                                            scSwitch.nextLine();
                                            String nomeFunc1 = scSwitch.nextLine();
                                            System.out.println("Digite o número do boi que vai ser morto.");
                                            int numeroboi4 = scSwitch.nextInt();

                                            for(int a = 0; a < listaFuncionariosFrigorifico.size(); a++){
                                                if(listaFuncionariosFrigorifico.get(a).getNome().equals(nomeFunc1)){
                                                    for(int i = 0 ; i < listaBois.size(); i++){
                                                        if(listaBois.get(i).getNumeracao() == numeroboi4){
                                                            FuncionarioFrigorifico funcAux = (FuncionarioFrigorifico) listaFuncionariosFrigorifico.get(a);
                                                        listaFrigorificos.get(0).matarBoi(funcAux, listaBois.get(i));
                                                        }
                                                    }
                                                }
                                            }
                                            
                                            break;

                                        case 3:
                                            
                                            System.out.println(listaFrigorificos.get(0).toString());
                                            break;
                                        case 4:
                                            
                                            aux = 12;
                                            break;
                                    }
                                }
                                break;
                                    case 6:
                                    aux = 7;
                                    break;
                            }     
                        }
                        break;
//////////////////////////////////////////////////////////////ACOUGUE////////////////////////////////////////////////         
//////////////////////////////////////////////////////////////ACOUGUE////////////////////////////////////////////////
//////////////////////////////////////////////////////////////ACOUGUE////////////////////////////////////////////////

                    case 3:
                       
                        while(aux != 13){
                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                    "\n1. Funcionário Açougue"+
                                    "\n2. Dono do Açougue"+
                                    "\n3. Açougue"+
                                    "\n4. Voltar");

                            int escolha2 = scSwitch.nextInt();
                            switch (escolha2) {
                                case 1:
                                    while(aux != 14){
                                        System.out.println("\nEscolha o processo a ser mostrado: "+
                                            "\n1. Cadastrar funcionário."+
                                            "\n2. Voltar");
                                        int escolha4 = scSwitch.nextInt();
                                        int id = 0;
                                        switch (escolha4) {
                                            case 1:
                                                id = UUID.randomUUID().hashCode();

                                                System.out.println("Digite o nome do funcionário.");
                                                scSwitch.nextLine();
                                                String nome1 = scSwitch.nextLine();
                                                System.out.println("Digite a idade do funcionário.");
                                                int idade1 = scSwitch.nextInt();
                                                System.out.println("Digite o CPF do funcionário.");
                                                String CPF1 = scSwitch.next();
                                                System.out.println("Digite o telefone do funcionário.");
                                                String telefone1 = scSwitch.next();

                                                listaFuncionariosAcougue.add(new FuncionarioAcougue(nome1, idade1, CPF1, telefone1));

                                                System.out.println("Funcionário cadastrado com sucesso.");
                                                break;
                                                
                                            case 2:
                                            aux = 14;
                                            break;
                                        }
                                    }
                                    break;
                                
                                case 2:
                                while(aux !=15){
                                    if(listaDonosAcougue.size() == 0){
                                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                                "\n1. Cadastrar dono do açougue."+
                                                "\n2. Voltar");
                                            int escolha5 = scSwitch.nextInt();
                                            int id = 0;
                                            switch (escolha5) {
                                                case 1:
                                                    id = UUID.randomUUID().hashCode();

                                                    System.out.println("Digite o nome do dono do açougue.");
                                                    scSwitch.nextLine();
                                                    String nome1 = scSwitch.nextLine();
                                                    System.out.println("Digite a idade do dono do açougue.");
                                                    int idade1 = scSwitch.nextInt();
                                                    System.out.println("Digite o CPF do dono do açougue.");
                                                    String CPF1 = scSwitch.next();
                                                    System.out.println("Digite o telefone do dono do açougue.");
                                                    String telefone1 = scSwitch.next();
                                                    System.out.println("Lista de funcionários passada com succeso.");

                                                    listaDonosAcougue.add(new DonoAcougue(nome1, idade1, CPF1, telefone1, listaFuncionariosAcougue));

                                                    System.out.println("Cadastro realizado com succeso.");
                                                    break;
                                                    
                                                case 2:
                                                aux =15;
                                                break;
                        
                                            }
                                            break;
                                        } else{
                                            int id = 0;
                                            
                                            System.out.println("\nEscolha o processo a ser mostrado: "+
                                                "\n1. Demitir funcionário"+
                                                "\n2. Contratar funcionário"+
                                                "\n3. Dados do dono do açougue"+
                                                "\n4. Voltar.");
                                            int escolha6 = scSwitch.nextInt();
                                            switch (escolha6) {
                                                case 1:
                                                    System.out.println("Digite o nome do funcionário que será demitido.");
                                                    scSwitch.nextLine();
                                                    String nomeFunc1 = scSwitch.nextLine();

                                                    for(int i = 0; i< listaFuncionariosAcougue.size(); i++){
                                                        if(listaFuncionariosAcougue.get(i).getNome().equals(nomeFunc1)){
                                                            listaDonosAcougue.get(0).demitir(listaFuncionariosAcougue.get(i));
                                                        }
                                                    }
                                                break;
                                                case 2:
                                                    System.out.println("Digite o nome do funcionário que será contratado.");
                                                    scSwitch.nextLine();
                                                    String nomeFunc2 = scSwitch.nextLine();
                                                    
                                                    for(int a= 0; a< listaFuncionariosAcougue.size(); a++){
                                                        if(listaFuncionariosAcougue.get(a).getNome().equals(nomeFunc2)){
                                                            listaDonosAcougue.get(0).contratar(listaFuncionariosAcougue.get(a));
                                                        }
                                                    }

                                                    break;

                                                case 3:
                                                    System.out.println(listaDonosAcougue.get(0).toString());
                                                    break;
                                                case 4:
                                                    break;
                                            }
                                        break;
                                        }
                                    
                                }
                                break; 
                                
                                case 3:
                                while(aux != 16){
                                    System.out.println("\nEscolha o processo a ser mostrado: "+
                                                        "\n1. Comprar carne"+
                                                        "\n2. Cortar carne"+
                                                        "\n3. Dados do açougue"+
                                                        "\n4. Voltar");
                                    listaAcougues.add(new Acougue(listaDonosAcougue.get(0)));
                                    int escolha8 = scSwitch.nextInt();
                                    switch (escolha8) {
                                        case 1:
                                            System.out.println("Comprando carne.");
                                            listaAcougues.get(0).comprar(listaFrigorificos.get(0));
                                            break;
                                          
                                    
                                        case 2:
                                            listaAcougues.get(0).cortarCarne();
                                            break;

                                        case 3:
                                            System.out.println(listaAcougues.get(0).toString());
                                            break;
                                        case 4:
                                            aux = 16;
                                            break;
                                    }break;
                                }
                        break;
                        
                        case 4:      
                                aux =13;
                                break;          
                            }
                    
                        }
                        break;
                    case 4:
                        while(aux !=17){
                            if(listaClientesFinais.size() == 0){
                                System.out.println("\nEscolha o processo a ser mostrado: "+
                                    "\n1. Cadastrar cliente final."+
                                    "\n2. Voltar");
                                 int escolha9 = scSwitch.nextInt();
                                 int id = 0;
                                 switch (escolha9) {
                                     case 1:
                                         id = UUID.randomUUID().hashCode();

                                         System.out.println("Digite o nome do cliente final.");
                                         scSwitch.nextLine();
                                           String nome1 = scSwitch.nextLine();
                                           System.out.println("Digite a idade do cliente final.");
                                           int idade1 = scSwitch.nextInt();
                                        System.out.println("Digite o CPF do cliente final");
                                        String CPF1 = scSwitch.next();
                                        System.out.println("Digite o telefone do cliente final");
                                        String telefone1 = scSwitch.next();
                                        System.out.println("Digite o saldo do cliente final");
                                        double saldo1 = scSwitch.nextDouble();

                                        listaClientesFinais.add(new ClienteFinal(nome1, idade1, CPF1, telefone1, saldo1));
                                        System.out.println("Cadastro realizado com succeso.");
                                         break;

                                    case 2:
                                        aux = 17;
                                        break;
                                }
                                            break;  
                            } else{
                                 System.out.println("\nEscolha o processo a ser mostrado: "+
                                    "\n1. Comprar"+
                                    "\n2. Dados do cliente final."+
                                    "\n3. Voltar.");
                                    int escolha10 = scSwitch.nextInt();
                                    int id = 0;
                                    switch (escolha10) {
                                        case 1:
                                            System.out.println("Digite a quantidade de quilos de carne a ser comprada.");
                                            int kgCarne = scSwitch.nextInt();
                                            listaClientesFinais.get(0).comprar(listaAcougues.get(0), kgCarne);;
                                            System.out.println("Verificar saldo em arquivo.txt.");

                                        
                                        case 2:
                                        System.out.println(listaClientesFinais.get(0).toString());

                                        case 3:
                                            aux = 17;
                                            break;
                                }
                            }
                        }
                        aux = 20;
                        break;
                        
                    case 5:
                        System.out.println("Programa finalizado com sucesso!");
                        aux = 1;
                        break;
                            
                    default:
                    System.out.println("Opção inválida!");
                        break;
            }
            
            } catch(InputMismatchException e){
                System.out.println("ERRO");
                e.printStackTrace();
            }
        }
    }
}




