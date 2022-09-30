package models;

public class NoTree {
    private NoTree[] filhos;
    private String info;
    private boolean fim;
    private int TL;

    public NoTree() {
        info = "";
        filhos = new NoTree[26];
        TL = 0;
    }

    public NoTree(String info) {
        this.info = info;
        filhos = new NoTree[26];
        TL = 0;
    }

    public NoTree(NoTree[] filhos, String info, boolean fim) {
        this.filhos = filhos;
        this.info = info;
        this.fim = fim;
        this.TL = 0;
    }
    
    public NoTree(NoTree[] filhos, String info, boolean fim, int TL) {
        this.filhos = filhos;
        this.info = info;
        this.fim = fim;
        this.TL = TL;
    }

    public NoTree getFilhos(int n) {
        return filhos[n];
    }

    public void setFilhos(int n, NoTree no) {
        this.filhos[n] = no;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }

    public NoTree[] getFilhos() {
        return filhos;
    }

    public void setFilhos(NoTree[] filhos) {
        this.filhos = filhos;
    }
}
