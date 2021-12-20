public final class Professor extends Pessoa{
    
    // Atributos
    private String especialidade;
    private float salario;

    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    // Abstract Methods
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
        System.out.println(this.getNome()+" recebeu aumento de R$ "+aumento +" seu salário agora é R$ "+this.getSalario());
    }

    // Setters and Getters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}