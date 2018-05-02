package Kruskal;
public class Aresta  implements Comparable<Aresta>{
    int vertice1, vertice2, peso;

    public Aresta(int vertice1, int vertice2, int peso) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.peso = peso;
    }
    
    @Override
    public int compareTo(Aresta outrasArestas) {
         if (peso > outrasArestas.getPeso()) {
              return 1;
         }  
         if (peso < outrasArestas.getPeso()) {
              return -1;
         }
         return 0;
    }

    public int getVertice1() {
        return vertice1;
    }

    public int getVertice2() {
        return vertice2;
    }

    public int getPeso() {
        return peso;
    }   
}