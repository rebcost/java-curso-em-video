public class Aluno extends Pessoa{
    
    // Atributes
    private int matricula;
    private String curso;
    
    
       

    // Setters e Getters
    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Abstract Method
    public void cancelarMatricula() {
        System.out.println("Matricula do aluno "+this.getNome()+" foi cancelada!");
    }
}
