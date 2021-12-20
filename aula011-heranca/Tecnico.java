public final class Tecnico extends Aluno{
    
    // Atributes
    private String registroProfisional;
    
    public Tecnico(String nome, String sexo, int idade, String matricula, String curso, String registroProfisional) {
        super(nome, sexo, idade, matricula, curso);
        this.registroProfisional = registroProfisional;
        
    }

    public void praticar() {
        System.out.println(this.getNome()+"agora está praticando sua profissão");
    }
    
    public String getRegistroProfisional() {
        return registroProfisional;
    }

    public void setRegistroProfisional(String registroProfisional) {
        this.registroProfisional = registroProfisional;
    }

    
}