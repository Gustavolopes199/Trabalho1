package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaFuncionario {

    Scanner id = new Scanner(System.in);

    public void chamarFuncFuncionario(ArrayList<InfUsuario> usuarios, ArrayList<Boletos> boleto) {
        int id = consultarAluno(usuarios);
        if (id != 0) {
            switch (opcoesFunc()) {
                case 1:
                    consultarBoletos(usuarios, boleto, id);
                    break;
                case 2:
                    alterarValor(id, boleto);
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Call ativar aluno");
                    break;
                case 5:
                    System.out.println("out breakpoint");
                    break;
            }
        } else {
            System.out.println("Aluno não encontrado");
            chamarFuncFuncionario(usuarios, boleto);
        }
    }

    private int opcoesFunc() {
        System.out.println("Bem vindo, qual ação deseja realizar?");
        System.out.println("1 - Pagamento");
        System.out.println("2 - Alterar valor");
        System.out.println("3 - Alterar vencimento");
        System.out.println("4 - Sair do sistema");
        int topz = id.nextInt();
        return topz;
    }


    public void impress1(InfUsuario Teste) {
        System.out.printf("Olá %s, qual ação gostaria de realizar", Teste.getNome());
    }

    public void impress2(InfUsuario Teste) {
        System.out.printf("Ola %s, você não é aluno, contate o financeiro", Teste.getNome());
    }

    public String lerNome() {
        return id.nextLine();
    }

    public int consultarAluno(ArrayList<InfUsuario> usuarios) {
        System.out.println("Digite o cpf do aluno que deseja alterar os dados");
        String cpf = id.nextLine();
        int exec = 0;
        for (InfUsuario ide : usuarios) {
            if (ide.getCpf().equals(cpf)) {
                exec = ide.getId();
            } else {
                exec = 0;
            }
        }
        return exec;
    }

    public String consultarAluno(int id) {
        return "empty";
    }

    public void consultarBoletos(ArrayList<InfUsuario> usuarios, ArrayList<Boletos> boletos, int id) {
        Scanner id1 = new Scanner(System.in);
        ArrayList<Integer> apagar = new ArrayList<>();
        apagar.add(1111111111);
        for (Boletos boleto : boletos) {
            if (boleto.getId_aluno() == id) {
                int i = 1;
                if (boleto.isPago() == true) {
                    System.out.println("O boleto no valor de: R$" + boleto.getValor() + " e vencimento em: " + boleto.getData_vencimento() + " esta pago");
                } else {
                    System.out.println("O boleto n°: " + i + ", no valor de: R$" + boleto.getValor() + " e vencimento em: " + boleto.getData_vencimento() + " esta vencido");
                    apagar.add(boleto.getId_boleto());
                }
            }
        }
        System.out.println("Deseja pagar algum? Se sim, por favor digitar o codigo");
        int h = id1.nextInt();
        for (Boletos boleto : boletos) {
            if (apagar.get(h) == boleto.getId_boleto()) {
                boleto.setPago(true);
            }
        }
    }

    public String consultarExtrato() {
        return "ximpa";
        //retorna pagamentos
    }

    public void alterarVencimento() {
        //altera data de vencimento
    }

    public void alterarValor(int id_aluno, ArrayList<Boletos> boletoslist) {

        System.out.println("Qual boleto deseja alterar:");
        Scanner id = new Scanner(System.in);
        ArrayList<Integer> boletoalterar = new ArrayList<>();
        int i = 0;
        for (Boletos boletos : boletoslist) {
            if (boletos.getId_aluno() == id_aluno) {
                System.out.println("Boleto n°:" + i + " valor: R$" + boletos.getValor());
                boletoalterar.add(boletos.getId_boleto());
                i++;
            }
        }
        int h = id.nextInt();
        for (Boletos boletos : boletoslist) {
            if (boletoalterar.get(h) == boletos.getId_boleto()) {
                System.out.println("Qual novo valor do boleto?");
                boletos.setValor(id.nextInt());
            }
        }

        for (Boletos boletos : boletoslist) {
            System.out.println(boletos.getValor());
        }

    }

}
