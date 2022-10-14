package br.com.newton.conta;

import java.security.spec.RSAOtherPrimeInfo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("### Extrato da Conta ###");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
    }
}
