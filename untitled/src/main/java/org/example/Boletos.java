package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Boletos {

    int id_boleto;
    int id_aluno;
    double valor;
    double valor_pago;
    boolean pago;
    LocalDate data_vencimento;
    LocalDate data_pagamento;

    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    LocalTime data_atual = LocalTime.now(ZoneId.systemDefault());

    public int getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(int id_boleto) {
        this.id_boleto = id_boleto;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public LocalDate getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(LocalDate data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public LocalTime getData_atual() {
        return data_atual;
    }

    public Boletos(int id_boleto, int id_aluno, double valor, double valor_pago, boolean pago, LocalDate data_vencimento, LocalDate data_pagamento) {
        this.id_boleto = id_boleto;
        this.id_aluno = id_aluno;
        this.valor = valor;
        this.valor_pago = valor_pago;
        this.pago = pago;
        this.data_vencimento = data_vencimento;
        this.data_pagamento = data_pagamento;
    }

    public Boletos() {
    }
}
