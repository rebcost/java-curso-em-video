public class Aula012{
    public static void main(String[] args) {
        Mamifero m = new Mamifero(134.5f, 41, 4, "Castanho");
        Peixe p = new Peixe(1, 2, 0, "Dourado");
        Reptil r = new Reptil(12.4f, 12, 2, "Verce");
        Ave a = new Ave(9, 4, 2, "Azul e Verde");
        Cachorro k = new Cachorro(9.0f, 8, 4, "Amarelo");
        Cobra cb = new Cobra(0.4f, 1, 0, "Branco e Vermelho");
        Tartaruga t = new Tartaruga(82, 45, 4, "Verde");
        Goldfish g = new Goldfish(0.4f, 1, 2, "Roxo");
        Arara ar = new Arara(3, 3, 2, "Azul e Vermelho");

        
        k.alimentar();
        k.emitirSom();
        k.locomover();

        cb.alimentar();
        cb.emitirSom();
        cb.locomover();

        t.alimentar();
        t.emitirSom();
        t.locomover();

        g.alimentar();
        g.emitirSom();
        g.locomover();

        ar.alimentar();
        ar.emitirSom();
        ar.locomover();


    }
}