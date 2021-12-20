public abstract class Pessoa {
    // Atributos
    protected String nome, sexo;
    protected int idade, experiencia;
    

    public Pessoa(String nome, String sexo, int idade, int experiencia) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }

    // Getters e Setters
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    // Método Abstrato
    protected void ganharExperiencia(){
        this.setExperiencia(this.getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa [experiencia=" + experiencia + ", idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

    

   

}
