package Kruskal;
public class Grafo {
    public static void main(String[] args) {
        Kruskal g = new Kruskal(8);

        /*1*/
        g.addAresta(0, 1, 240);
        g.addAresta(0, 2, 210);
        g.addAresta(0, 3, 340);
        g.addAresta(0, 4, 280);
        g.addAresta(0, 5, 200);
        g.addAresta(0, 6, 345);
        g.addAresta(0, 7, 120);
        /*2*/
        g.addAresta(1, 2, 265);
        g.addAresta(1, 3, 175);
        g.addAresta(1, 4, 215);
        g.addAresta(1, 5, 180);
        g.addAresta(1, 6, 185);
        g.addAresta(1, 7, 155);
        /*3*/
        g.addAresta(2, 3, 260);
        g.addAresta(2, 4, 115);
        g.addAresta(2, 5, 350);
        g.addAresta(2, 6, 435);
        g.addAresta(2, 7, 195);
        /*4*/
        g.addAresta(3, 4, 160);
        g.addAresta(3, 5, 330);
        g.addAresta(3, 6, 295);
        g.addAresta(3, 7, 230);
        /*5*/
        g.addAresta(4, 5, 360);
        g.addAresta(4, 6, 400);
        g.addAresta(4, 7, 170);
        /*6*/
        g.addAresta(5, 6, 175);
        g.addAresta(5, 7, 205);
        /*7*/
        g.addAresta(5, 7, 305);

        g.kruskal();
    }
}
