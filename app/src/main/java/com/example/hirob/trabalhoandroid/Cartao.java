package com.example.hirob.trabalhoandroid;

/**
 * Created by hirob on 03/10/2017.
 */

public class Cartao {
    private String nome;
    private String vencimento;
    private double limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
