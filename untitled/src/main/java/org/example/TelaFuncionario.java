package org.example;

import java.util.ArrayList;

public class TelaFuncionario {

    /* 
    public void testeFuncionamento(InfUsuario opcao){
        if(opcao.isFuncionario() = true){  
        impress1(opcao);
     }else(opcao.isFuncionario() = false){ 
        impress2(opcao);
     }
    }  */


    public void impress1(InfUsuario Teste){
        System.out.printf("Olá %s, qual ação gostaria de realizar", Teste.getNome());
    }

    public void impress2(InfUsuario Teste){
        System.out.printf("Ola %s, você não é aluno, contate o financeiro", Teste.getNome());
    }
    
    
    public int consultarAluno (String nome, ArrayList teste){
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
