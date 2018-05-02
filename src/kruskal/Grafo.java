package Kruskal;
public class Grafo {
    public static void main(String[] args) {
        Kruskal g = new Kruskal(6);
        
        g.addAresta(0, 1, 1);
        g.addAresta(0, 2, 3);
        
        g.addAresta(1, 0, 1);
        g.addAresta(1, 2, 1);
        g.addAresta(1, 3, 2);
        g.addAresta(1, 4, 3);
        
        g.addAresta(2, 0, 3);
        g.addAresta(2, 1, 1);
        g.addAresta(2, 4, 2);
        
        g.addAresta(3, 1, 2);
        g.addAresta(3, 4, -3);
        g.addAresta(3, 5, 3);
        
        g.addAresta(4, 1, 3);
        g.addAresta(4, 2, 2);
        g.addAresta(4, 3, -3);
        g.addAresta(4, 5, 2);
        
        g.addAresta(5, 3, 3);
        g.addAresta(5, 4, 2);
        
        g.kruskal();
    }
}
