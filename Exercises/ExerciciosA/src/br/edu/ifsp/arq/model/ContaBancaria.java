/*
 * 7 - Criar conta bancária com depósitos e saques concorrentes
 */
package br.edu.ifsp.arq.model;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor + " | Saldo atual: " + saldo);
    }

    public synchronized void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: " + valor + " | Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}