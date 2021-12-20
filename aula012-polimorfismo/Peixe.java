public class Peixe extends Animal{
    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
        
    }

    @Override
    public void locomover() {
        System.out.println("Nadando ....");
        
    }

    public void soltarBolhas() {
        System.out.println("OoOoOoO");
    }

    
}
