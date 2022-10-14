package br.com.newton.lojacomercial;

public class MainLoja {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("aaaa", "MG-11111111", 20000, 0.05);
        vendedor.vendasMes();
        vendedor.salarioVend();

        Administrativo administrativo = new Administrativo("bbbb", "MG-22222222", 3000);
        administrativo.horasExtras(10);
        administrativo.salarioAdm();
    }
}
