public class Funcionario extends Pessoa{
    
    // Atributes
    private String setor;
    private boolean trabalhando;
    
    // Constructor
   
    // Setters and Getters
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }    

    // Abstract Methods
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }
    
}
