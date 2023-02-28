package org.example;

import java.math.BigInteger;

public class DataBase {

    private BigInteger id;
    private BigInteger idUser;
    private String data_vencimento;
    private String data_pagamento;
    private String data_geracao;
    private String mes_mensalidade;

    private boolean pago;
    private Double valor_mensalidade;
    private Double valor_pago;
    private Double valor_diferenca;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getIdUser() {
        return idUser;
    }

    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getData_geracao() {
        return data_geracao;
    }

    public void setData_geracao(String data_geracao) {
        this.data_geracao = data_geracao;
    }

    public String getMes_mensalidade() {
        return mes_mensalidade;
    }

    public void setMes_mensalidade(String mes_mensalidade) {
        this.mes_mensalidade = mes_mensalidade;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Double getValor_mensalidade() {
        return valor_mensalidade;
    }

    public void setValor_mensalidade(Double valor_mensalidade) {
        this.valor_mensalidade = valor_mensalidade;
    }

    public Double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(Double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public Double getValor_diferenca() {
        return valor_diferenca;
    }

    public void setValor_diferenca(Double valor_diferenca) {
        this.valor_diferenca = valor_diferenca;
    }
}
