package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaFuncionario {

    Scanner id = new Scanner(System.in);
   public void chamarFuncFuncionario(ArrayList<InfUsuario> usuarios, ArrayList<Boletos> boleto){
       int id = consultarAluno(usuarios);
       if(id != 0){
    switch(opcoesFunc()){
        case 1:
        consultarBoletos(usuarios, boleto, id);
            break;
        case 2:
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
       }else{
           System.out.println("Aluno não encontrado");
           chamarFuncFuncionario(usuarios,boleto);
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

    public int consultarAluno(ArrayList<InfUsuario> usuarios){
        System.out.println("Digite o cpf do aluno que deseja alterar os dados");
        String cpf = id.nextLine();
        for(InfUsuario ide : usuarios){
            if(ide.getCpf().equals(cpf)){
                System.out.println("gostoso");
                return ide.getId();
            }
        }
        return 0;
    }
 
    public String consultarAluno(int id){
        return "empty";
    }

    public void consultarBoletos(ArrayList<InfUsuario> usuarios, ArrayList<Boletos> boletos, int id){
            for(Boletos boleto : boletos) {
                if (boleto.getId_aluno() == id) {
                    if (boleto.isPago() == true) {
                        System.out.println("O boleto no valor de: R$" + boleto.getValor() + " e vencimento em: " + boleto.getData_vencimento() + " esta pago");
                    } else {
                        System.out.println("O boleto no valor de: R$" + boleto.getValor() + " e vencimento em: " + boleto.getData_vencimento() + " esta vencido");
                    }
                }
            }
                System.out.println("Deseja pagar algum? Se sim, por favor digitar o codigo, caso não queira, digitar 0");
            int h = id.nextInt();

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


  /*  public void listarEscolherBoletos(int id){
       for(InfUsuario boleto : criaruser.boleto){

       }
    }*/



}
