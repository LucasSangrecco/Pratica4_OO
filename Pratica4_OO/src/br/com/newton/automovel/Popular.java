package br.com.newton.automovel;

public class Popular extends Automovel{

    private double desconto;

    public Popular(boolean abs, boolean airBag, boolean alarme, boolean som, boolean conjuntoEletrico, boolean computadordebordo, double precoBase, double opcional, double desconto) {
        super(abs, airBag, alarme, som, conjuntoEletrico, computadordebordo, precoBase, opcional);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String calcularPrecoFinalPopular(double precoPopular){
        precoPopular = getPrecoBase() + getOpcional() - getDesconto();
        return "O preço final do carro popular é: " + precoPopular;
    }
}
