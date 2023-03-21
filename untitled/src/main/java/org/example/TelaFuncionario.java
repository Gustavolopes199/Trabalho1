package org.example;

import java.util.Scanner;

public class TelaFuncionario {
    CriarUsuario criaruser = new CriarUsuario();



    Scanner id = new Scanner(System.in);
   public void chamarFuncFuncionario(){
    switch(opcoesFunc()){
        case 1:
        System.out.println("call pagamento");
            break;
        case 2:
            System.out.println("call para consultar aluno");
            break;
        case 3:
            System.out.println("Call alterar valor");
            break;
        case 4:
            System.out.println("Call ativar aluno");
            break;
        case 5:
            System.out.println("Call alterar vencimento");
            break; 
    }
}

    private int opcoesFunc(){
        System.out.println("Bem vindo, qual ação deseja realizar?");
        System.out.println("1 - Pagamento");
        System.out.println("2 - Consultar Alunos");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Ativar aluno");
        System.out.println("5 - Alterar vencimento");
        int topz = id.nextInt();
        return topz;
    }


    public void impress1(InfUsuario Teste){
        System.out.printf("Olá %s, qual ação gostaria de realizar", Teste.getNome());
    }

    public void impress2(InfUsuario Teste){
        System.out.printf("Ola %s, você não é aluno, contate o financeiro", Teste.getNome());
    }
    
    public String lerNome(){
        return id.nextLine();
    }

    public int consultarAluno(){
        System.out.println("Digite o nome do aluno que deseja achar");
        String nome = id.nextLine();
        for(InfUsuario nomes : criaruser.torto){
            if(nomes.contains){
                System.out.println(nome);
            }
        }
        int boca = 999;
        return boca;
        
    }
 
    public String consultarAluno(int id){
        return "empty";
    }

    public void pagar(){
        //metodo/pagar
    }
    public String consultarExtrato(){
        return "ximpa";
        //retorna pagamentos
    }
    public void alterarVencimento(){
     //altera data de vencimento
    }
    public void alterarValor(){
        //alterar valor -- receber motivo alteração valor
        //verificar se usuario possui permissão
    }





}
