package br.com.newton.containterface;

public class GeradorExtratos {
    public void geradorConta(Conta conta){
        System.out.println("Saldo Atual: " + conta.getSaldo());
    }
}
