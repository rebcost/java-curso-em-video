public class Ave extends Animal{
    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        System.out.println("Comer frutas");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave.....");
        
    }

    @Override
    public void locomover() {
       System.out.println("Voando....");
        
    }

    public void fazerNinho() {
        System.out.println("Contruiu um ninho");
    }
    

    
}
