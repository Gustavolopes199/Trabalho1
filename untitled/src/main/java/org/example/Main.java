package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CriarUsuario CRA = new CriarUsuario();
        TelaParaAluno TPA = new TelaParaAluno();
        TelaFuncionario TF = new TelaFuncionario();
        
        ArrayList<InfUsuario> torto = new ArrayList<>();
        torto.add(CRA.aluno1);
        torto.add(CRA.aluno2);

        System.out.println("DIGITE O NOME DO ALUNO QUE DESEJA ACHAR");
        Scanner id = new Scanner(System.in);
        String nome = id.nextLine();


        System.out.println(TF.consultarAluno(nome, torto));

        
    }
}