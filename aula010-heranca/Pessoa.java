public class Pessoa {
    private String nome, sexo;
    private int idade;

    // Construct    
    
    
    // Setters and Getters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Abstract methods
    public void fazerAniversario() {
        this.setIdade(getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", \nIdade=" + idade + ", \nSexo=" + sexo;
    }
    
}
