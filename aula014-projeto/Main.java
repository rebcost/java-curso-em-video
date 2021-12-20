public class Main{
    public static void main(String[] args) {
        Video v[] = new Video[2];

        v[0] = new Video("Video POO");
        v[1] = new Video("Novo vídeo de Java");

        // System.out.println(v[0].toString());
        // System.out.println(v[1].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Pedro", "M", 14, 5, "pedrinhoyt");
        g[1] = new Gafanhoto("Maria", "F", 20, 4, "maria01");

        // System.out.println(g[0].toString());
        // System.out.println(g[1].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        vis[0].avaliar(10);
        System.out.println(vis[0].toString());
    }
}