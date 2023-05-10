package org.example;

import java.util.*;

public class DecidirAluno {

    TelaFuncionario TF = new TelaFuncionario();
    CriarUsuario CU = new CriarUsuario();

    ArrayList<Boletos> boletos = new ArrayList<>();
    ArrayList<InfUsuario> usuario = new ArrayList<>();
    Scanner id = new Scanner(System.in);
    public void chamaFuncao(){
        CU.criarUsuarios(usuario);
        CU.criarBoletos(boletos);
        int i = defUsuario();
    if(i == 1 || i == 2 ){
        if(i == 1) {
            System.out.println("call tela usuario");
        }else{
            TF.chamarFuncFuncionario(usuario,boletos);
        }
    } else{
        System.out.println("out");
    }
}
    
    private int defUsuario(){
        System.out.printf("Bem vindo! Digite: %n 1 - Para login como usuario %n 2 - Para login como funcionário %n");
        int teste = id.nextInt();
        for(int i = 0; i < 10; i++){
        if(teste == 1){
            teste = 1;
            i = i + 10;
        }else if(teste == 2){
            teste = 2;
            i = i + 10;
        }else{
            teste = 0;
            System.out.println("Defina qual usuario quer usar");   
            teste = id.nextInt();
        }
        }    
        return teste;
    }
}

