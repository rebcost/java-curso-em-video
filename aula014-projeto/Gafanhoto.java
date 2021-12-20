public class Gafanhoto extends Pessoa{
    // Atributos
    private String login;
    private int totAssistidos;

    // Construtor
    public Gafanhoto(String nome, String sexo, int idade, int experiencia, String login) {
        super(nome, sexo, idade, experiencia);
        this.login = login;
        this.totAssistidos = 0;
    }

    // Getters and setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }

    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }

    // Métodos Abstratos
    public void viewMaisUm(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"\nGafanhoto [login=" + login + ", totAssistidos=" + totAssistidos + "]";
    }

    

    

   
    
}
