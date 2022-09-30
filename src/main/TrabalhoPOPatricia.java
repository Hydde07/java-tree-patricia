package main;

import models.PTree;

public class TrabalhoPOPatricia {

 
    public static void main(String[] args) {
        PTree tree = new PTree();
        //INSERÇÃO DAS PALAVRAS NA ÁRVORE E EXIBIÇÃO POR NÍVEL
        tree.inserir("bear");
        tree.inserir("Bell");
        tree.inserir("bid");
        tree.inserir("Bull");
        tree.inserir("buy");
        tree.inserir("sell");
        tree.inserir("stock");
        tree.inserir("stop");
        System.out.print("EXIBIÇÃO POR NÍVEL:");
        tree.exibeNivel();
        
        //EXIBIÇÃO DAS PALAVRAS NA ÁRVORE
        System.out.println("EXIBIÇÃO DE PALAVRAS:");
        tree.exibe();
    }
    
}
