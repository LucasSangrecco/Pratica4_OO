package br.com.newton.conta;

public class Main {

    public static void main(String[] args) {

        Conta cp = new ContaPoupanca(0);
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }

}
