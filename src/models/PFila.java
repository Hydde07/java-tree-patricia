package models;

public class PFila {
    private NoFilaP inicio, fim;

    public PFila() {
        inicio = null;
        fim = null;
    }
    
    public void enqueue(NoTree info){
        NoFilaP no = new NoFilaP(info);
        if(inicio == null)
            inicio = fim = no;
        else{
            no.setAnt(fim);
            fim.setProx(no);
            fim = fim.getProx();
        }
    }
    
    public NoTree dequeue(){
        NoTree info = inicio.getInfo();
        inicio = inicio.getProx();
        if(inicio!=null)
            inicio.setAnt(null);
        else
            fim = null;
        return info;
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
}
