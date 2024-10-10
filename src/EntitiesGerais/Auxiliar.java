package EntitiesGerais;

import Exceptions.DadoInvalidoException;
import java.io.File;
import java.io.IOException;



//ADICIONAR ERRO PRA CASO NAO SEJA UM FUNCIONARIO NO DIRETOR
public class Auxiliar {
    public static void verificarDados(String nome, int idade, String CPF, String telefone) throws DadoInvalidoException {
        char[] charsNome = nome.toCharArray();

        for (char c : charsNome) {
            if (Character.isDigit(c)) {
                throw new DadoInvalidoException("Nome inválido: contem número(s).");
            }
        }
        if (idade < 0 || idade > 100) {
            throw new DadoInvalidoException("idade inválida");
        }
        char[] charsCPF = CPF.toCharArray();
        if (charsCPF.length != 11) {
            throw new DadoInvalidoException("CPF inválido: tamanho incorreto.");
        }
        for (char c : charsCPF) {
            if (Character.isLetter(c)) {
                throw new DadoInvalidoException("CPF inválido: contem letra(s).");
            }
        }

        char[] charsTelefone = telefone.toCharArray();
        for (char c : charsTelefone) {
            if (Character.isLetter(c)) {
                throw new DadoInvalidoException("Telefone inválido: contem letra(s).");
            }
        }
    }

    public static void criarArquivo(String path){
        File file = new File(path);
        try{
            file.createNewFile();
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("ERRO");
        }
        
    }
    
}
