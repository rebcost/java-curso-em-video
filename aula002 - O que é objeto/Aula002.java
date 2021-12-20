public class Aula002 {
    public static void main(String[] args) {
        Cadeira cad1 = new Cadeira();
        cad1.tipo = "madeira";
        cad1.tamanho = "Médio";
        cad1.cor = "branco";
        cad1.sentar();
        cad1.status();
    }
}