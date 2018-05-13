package Kruskal;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal{
    int v;
    ArrayList<Aresta> arestas = new ArrayList<>();

    Kruskal(int TAMANHO) {
        this.v = TAMANHO;
    }
    
    public void addAresta(int v1, int v2, int peso){
        Aresta aresta = new Aresta(v1, v2, peso);
        arestas.add(aresta);
    }
    
    public int busca(ArrayList subset, int i){
        return (int) subset.get(i);
    }
    
    public void unir(ArrayList subset, int v1, int v2){
        int v1_set = busca(subset, v1);
	int v2_set = busca(subset, v2);
        subset.set(v1_set, v2_set);
    }
    
    public void kruskal(){
        //System.out.println("3");
        ArrayList<Aresta> arvore = new ArrayList<>();
        int size_arestas = arestas.size();
        Collections.sort(arestas);
        ArrayList<Integer> subset = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            subset.add(i);
        }
        
        for (int i = 0; i < size_arestas; i++) {
        //System.out.println("4");
            int v1 = busca(subset, arestas.get(i).getVertice1());
            int v2 = busca(subset, arestas.get(i).getVertice2());
            
            if(v1 != v2){
                arvore.add(arestas.get(i));
                
                unir(subset, v1, v2);
            }
            
            for (int j = v; j < arvore.size(); j++) {
                arvore.remove(v);
            }
        }
        
        int size_arvore = arvore.size();
        for (int i = 0; i < size_arvore; i++) {
            int v1 = 1 + arvore.get(i).getVertice1();
            int v2 = 1 + arvore.get(i).getVertice2();
            System.out.println("(" + v1 + " ---> " + v2 + ") = " + arvore.get(i).getPeso());
        }
    }   
}