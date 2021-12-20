public class Cachorro extends Mamifero {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public void enterrarOsso() {
        System.out.println("Enterrando Osso....");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo....");
    }

    @Override
    public void emitirSom() {    
        System.out.println("AUAUAUAUUAUAUAu");
    }

    
}
