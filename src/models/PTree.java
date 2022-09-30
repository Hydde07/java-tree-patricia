package models;

public class PTree {
    private NoTree inicio;

    public PTree(NoTree inicio) {
        this.inicio = inicio;
    }

    public PTree() {
        this.inicio = new NoTree();
    }
    
    public void inserir(String info){
        int i = 0, j;
        boolean flag = true;
        NoTree aux = inicio;
        info = info.toLowerCase();
        while(flag && i < info.length()){
            if(aux.getFilhos(info.charAt(i)-97) == null){
                aux.setFilhos(info.charAt(i)-97, new NoTree(info.substring(i)));
                aux.getFilhos(info.charAt(i)-97).setFim(true);
                flag = false;
            }
            else{
                aux = aux.getFilhos(info.charAt(i)-97);
                for(j=0;i < info.length() && j < aux.getInfo().length() && aux.getInfo().charAt(j) == info.charAt(i);i++,j++){}
                if(j < aux.getInfo().length()){
                    NoTree nozin = new NoTree(aux.getFilhos(),aux.getInfo().substring(j),aux.isFim());
                    aux.setFilhos(new NoTree[26]);
                    aux.setInfo(aux.getInfo().substring(0, j));
                    aux.setFilhos(nozin.getInfo().charAt(0)-97, nozin);
                    aux.setFim(false);
                }
                else if(i == info.length() && j == aux.getInfo().length())
                    aux.setFim(true);
            }
        }
    }
    
    public void exibe(){
        exibe(inicio, "");
    }
    
    private void exibe(NoTree no, String s){
        if(no.isFim()) System.out.println(s);
            for(int i = 0; i < 26; i++){
                if(no.getFilhos(i) != null){
                    exibe(no.getFilhos(i), s + no.getFilhos(i).getInfo());
                }
        }
    }
    
    public void exibeNivel(){
        PFila fila = new PFila();
        int qt = 0, nivel = 1, aux = 0;
        NoTree walk;
        
        for(int i = 0; i < 26; i++){
            if(inicio.getFilhos(i) != null){
                fila.enqueue(inicio.getFilhos(i));
                qt++;
            }
        }
        System.out.println("\nNivel " + nivel + ": ");
        while(!fila.isEmpty()){
            if(qt==0){
                nivel++;
                qt = aux;
                aux = 0;
                System.out.println("\n\nNivel " + nivel + ": ");
            }
            walk = fila.dequeue();
            qt--;
            System.out.print(walk.getInfo() + " ");
            for(int i = 0; i < 26; i++){
                if(walk.getFilhos(i) != null){
                    fila.enqueue(walk.getFilhos(i));
                    aux++;
                }
            }
        }
        System.out.println("\n");
    }
}
