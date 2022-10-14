package br.com.newton.lojacomercial;

public class Administrativo extends Funcionario {

    private double salarioFixo;

    public Administrativo(String nome, String rg, double salarioFixos) {
        super(nome, rg);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public void horasExtras( int horasExtras){
        horasExtras++;
    }

    public String salarioAdm(){
        return "O salárion total do administrativo é: " + (getSalarioFixo() + (horasExtras()*(getSalarioFixo()*0.01)));
    }

}
