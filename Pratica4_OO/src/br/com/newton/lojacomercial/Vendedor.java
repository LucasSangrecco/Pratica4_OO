package br.com.newton.lojacomercial;

public class Vendedor extends Funcionario {

    private double salarioBase;
    private double comissao;

    public Vendedor(String nome, String rg, double salarioBase, double comissao) {
        super(nome, rg);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public void vendasMes(){
        double vendas=0;
        vendas++;
    }

    public String salarioVend (){
        return "O salario total do vendedor é: " + (getSalarioBase() + (vendasMes()*getComissao());

    }

}

