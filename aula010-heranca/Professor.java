public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    //Construct
        

    //Setters and Getters
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

    // Abstract Method
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
    }



    

}
