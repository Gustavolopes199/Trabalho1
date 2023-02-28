package org.example;

public class TelaParaAluno {
    InfUsuario IU = new InfUsuario();

    CriarUsuario teste = new CriarUsuario();


        
        public void impress1(InfUsuario Teste){
            System.out.printf("Olá %s, qual ação gostaria de realizar", Teste.getNome());
        }

        public void impress2(InfUsuario Teste){
            System.out.printf("Ola %s, você não é aluno, contate o financeiro", Teste.getNome());
        }

}
