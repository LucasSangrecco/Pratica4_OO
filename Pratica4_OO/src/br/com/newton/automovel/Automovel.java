package br.com.newton.automovel;

public class Automovel {

    private boolean abs;
    private boolean airBag;
    private boolean alarme;
    private boolean som;
    private boolean conjuntoEletrico;
    private boolean computadordebordo;
    private double precoBase;
    private double opcional;

    public Automovel(boolean abs, boolean airBag, boolean alarme, boolean som, boolean conjuntoEletrico, boolean computadordebordo, double precoBase, double opcional) {
        this.abs = abs;
        this.airBag = airBag;
        this.alarme = alarme;
        this.som = som;
        this.conjuntoEletrico = conjuntoEletrico;
        this.computadordebordo = computadordebordo;
        this.precoBase = precoBase;
        this.opcional = opcional;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public boolean isConjuntoEletrico() {
        return conjuntoEletrico;
    }

    public void setConjuntoEletrico(boolean conjuntoEletrico) {
        this.conjuntoEletrico = conjuntoEletrico;
    }

    public boolean isComputadordebordo() {
        return computadordebordo;
    }

    public void setComputadordebordo(boolean computadordebordo) {
        this.computadordebordo = computadordebordo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getOpcional() {
        return opcional;
    }

    public void setOpcional(double opcional) {
        this.opcional = opcional;
    }

    public String calcularPrecoFinal(){
        if(abs==true){
            this.opcional = this.precoBase * 0.15;
        }
        if(airBag==true){
            this.opcional = this.precoBase * 0.10;
        }
        if(alarme==true){
            this.opcional = this.precoBase * 0.03;
        }
        if (som==true){
            this.opcional = this.precoBase * 0.02;
        }
        if (conjuntoEletrico==true){
            this.opcional = this.precoBase * 0.05;
        }
        if (computadordebordo==true){
            this.opcional = this.precoBase * 0.10;
        }
        return "O preço final do carro é: " + (this.precoBase + this.opcional);
    }
}
