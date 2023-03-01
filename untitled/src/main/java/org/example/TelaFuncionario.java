package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaFuncionario {
    Scanner id = new Scanner(System.in);
    /* 
    public void testeFuncionamento(InfUsuario opcao){
        if(opcao.isFuncionario() = true){  
        impress1(opcao);
     }else(opcao.isFuncionario() = false){ 
        impress2(opcao);
     }
    }  */


    public int opcoesFunc(){
        System.out.println("Bem vindo, qual ação deseja realizar?");
        System.out.println("1 - Pagamento");
        System.out.println("2 - Consultar Alunos");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Ativar aluno");
        System.out.println("5 - Alterar vencimento");
        return id.nextInt();
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

    public int consultarAluno (ArrayList teste){
        System.out.println("Digite o nome do aluno que deseja achar");
        String nome = id.next();
        int boca = 999;
        for(int i = 0; i < teste.size(); i ++){
            if(teste.contains(nome)){
                boca = teste.indexOf(nome);
            }else{
                boca = 0;
            }            
        };
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
