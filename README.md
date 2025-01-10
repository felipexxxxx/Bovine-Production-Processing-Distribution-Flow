# Sistema de Produção de Carne 🥩

## **Descrição do Projeto**  
Este projeto foi desenvolvido como parte de um trabalho acadêmico na disciplina de **Programação Orientada a Objetos (POO)**. O objetivo foi implementar um sistema em Java que simula todo o processo de produção e comercialização de carne, desde a fazenda até o cliente final. O sistema gerencia fazendas, frigoríficos e açougues, permitindo o cadastro de funcionários, bois, e clientes finais, além de controlar as operações de compra, venda e corte de carne.

---

## **Funcionalidades do Sistema**  
- Gerenciamento de fazendas, frigoríficos e açougues com registros de donos e funcionários.
- Registro de bois, controle de alimentação e venda para frigoríficos.
- Controle do processo de abate e corte de carne no frigorífico.
- Cadastro de clientes e registro de compras no açougue.
- Controle completo por meio de um menu interativo com `switch`, permitindo que o usuário digite números para acessar funcionalidades específicas.

---

## **Requisitos Atendidos**  

### **Classes Abstratas**  
- `Pessoa`, `Animal`, `Funcionario`: implementam comportamentos genéricos herdados pelas classes específicas de funcionário e bois.

### **Interfaces**  
- `ICliente`: define métodos de compra em açougue e frigorífico.  
- `IContratante`: define métodos para contratar e demitir funcionários.  
- `IProdutos`: define métodos de venda de bois e carne.  

### **Tratamento de Exceções**  
Exceções personalizadas:
- `BoiErradoException`: lançada quando um funcionário tenta alimentar um boi que não lhe pertence.  
- `ContratoInvalidoException`: lançada ao tentar contratar ou demitir um funcionário inválido.  
- `DadoInvalidoException`: lançada quando dados como CPF ou idade são inválidos.

### **Métodos `throws`**  
Diversos métodos, como `contratar()`, `demitir()` e `alimentarBoi()`, utilizam a cláusula `throws` para sinalizar exceções.

### **Herança e Polimorfismo**  
- As classes `FuncionarioFazenda`, `FuncionarioFrigorifico`, `Gerente`, `Supervisor`, e `Diretor` herdam da classe `Funcionario`.  
- O polimorfismo é utilizado nos métodos `calcularSalario()` e `demitir()`, com sobrecarga e sobreposição de métodos.

---

## **Arquivos de Entrada e Saída**  
- `listaBois.txt`: arquivo que contém as informações iniciais dos bois (idade, numeração e peso).  
- O programa cria arquivos automaticamente em caso de inexistência e registra logs de transações e erros.

---

## **Estrutura de Classes do Sistema**  
### **Pacotes Principais**  
1. **EntitiesGerais:** contém as classes abstratas e interfaces gerais (`Pessoa`, `Funcionario`, `Animal`, `Auxiliar`).  
2. **EntitiesFazenda:** classes relacionadas às fazendas (`Boi`, `FuncionarioFazenda`, `DonoFazenda`, `Fazenda`).  
3. **EntitiesFrigorifico:** classes relacionadas ao frigorífico (`Frigorifico`, `FuncionarioFrigorifico`, `Supervisor`, `Gerente`, `Diretor`).  
4. **EntitiesAcougue:** classes do açougue (`Acougue`, `DonoAcougue`, `FuncionarioAcougue`, `ClienteFinal`).  
5. **Exceptions:** classes de exceções (`BoiErradoException`, `ContratoInvalidoException`, `DadoInvalidoException`).  

---

## **Menu Interativo**  
O programa apresenta um menu principal no console, onde o usuário pode digitar números para acessar diferentes funcionalidades:

### **Menu Principal:**  
1. Fazenda  
2. Frigorífico  
3. Açougue  
4. Cliente Final  
5. Sair  

### **Submenus:**  
#### **1. Fazenda**  
- Exibir informações dos bois.  
- Cadastrar funcionários.  
- Alimentar bois.  
- Contratar ou demitir funcionários.  
- Registrar venda de bois para frigorífico.  

#### **2. Frigorífico**  
- Cadastrar magarefes, supervisores, gerentes e diretores.  
- Abater bois e transformar em carne.  
- Registrar vendas de carne.  

#### **3. Açougue**  
- Cadastrar funcionários e donos do açougue.  
- Comprar carne do frigorífico e cortar peças.  
- Vender carne aos clientes finais.  

#### **4. Cliente Final**  
- Cadastrar clientes finais.  
- Registrar compras no açougue.

---

## **Como Executar o Projeto**  
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-producao-carne.git
2. Abra o projeto em uma IDE Java (como Eclipse ou IntelliJ).
3. Compile e execute a classe App.java.



