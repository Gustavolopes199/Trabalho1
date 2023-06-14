package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;


public class CriarUsuario {
    public void criarUsuarios(ArrayList<InfUsuario> lista){
        InfUsuario user1 = new InfUsuario();
        user1.setNome("Gustavo");
        user1.setSobrenome("buxexa");
        user1.setCep("cep");
        user1.setCpf("00000000000");
        user1.setId(1);
        user1.setEndereco("rua");
        user1.setAluno(true);
        user1.setData_cadastro(LocalDate.of(2020, 5, 10));
        user1.setMatricula("20230510");
        user1.setFuncionario(false);
        lista.add(user1);
    }


    public void criarBoletos(ArrayList<Boletos> listaboletos){
        Boletos boleto1 = new Boletos();
        boleto1.setId_boleto(15);
        boleto1.setPago(false);
        boleto1.setData_vencimento(LocalDate.of(2022,5,10));
        boleto1.setData_pagamento(null);
        boleto1.setValor(500.00);
        boleto1.setId_aluno(1);
        listaboletos.add(boleto1);
        Boletos boleto2 = new Boletos();
        boleto2.setId_boleto(2);
        boleto2.setPago(true);
        boleto2.setData_pagamento(LocalDate.of(2022, 12,31));
        boleto2.setValor(500.00);
        boleto2.setId_aluno(1);
        listaboletos.add(boleto2);
    }

    
}
