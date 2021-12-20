public class Aluno extends Pessoa{
    
    // Atributos
    private String matricula, curso;
    
    public Aluno(String nome, String sexo, int idade, String matricula, String curso) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }
    // Setters and Getters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Abstracts Methods
    public void pagarMensalidade() {
        System.out.println("Pagando Mensalidade do aluno "+this.getNome());
    }
    
}