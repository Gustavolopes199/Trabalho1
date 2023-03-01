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
        
        switch (TF.opcoesFunc()){
                case 1:
                TF.consultarAluno(torto);
                break;
                default:
                System.out.println("defaullt");
        }
        
        System.out.println(TF.consultarAluno(torto));
    }
}