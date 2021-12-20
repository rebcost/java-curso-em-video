public class Aula013{
    public static void main(String[] args) {
        Mamifero m = new Mamifero(13.2f, 11 , 4, "Preto e Branco");
        Lobo l = new Lobo(10.0f, 8, 4,"Branco");
        Cachorro k = new Cachorro(9.0f, 2, 4, "Castanho");

        k.emitirSom();
        k.reagir("Olá");
        k.reagir("Sai fora");
        k.reagir(11,45);
        k.reagir(21,00);
        k.reagir(true);

    }
}