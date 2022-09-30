package models;

public class NoFilaP {
    private NoFilaP prox, ant;
    private NoTree info;

    public NoFilaP() {
    }
    
    public NoFilaP(NoFilaP prox, NoFilaP ant, NoTree info) {
        this.prox = prox;
        this.ant = ant;
        this.info = info;
    }

    public NoFilaP(NoTree info) {
        this.prox = null;
        this.ant = null;
        this.info = info;
    }

    public NoFilaP getProx() {
        return prox;
    }

    public void setProx(NoFilaP prox) {
        this.prox = prox;
    }

    public NoFilaP getAnt() {
        return ant;
    }

    public void setAnt(NoFilaP ant) {
        this.ant = ant;
    }
    
    public NoTree getInfo() {
        return info;
    }

    public void setInfo(NoTree info) {
        this.info = info;
    }
}
