public class Goldfish extends Peixe{

    public Goldfish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo camaroẽs");
    }

    
    
}
