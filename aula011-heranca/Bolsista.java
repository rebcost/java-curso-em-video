public final class Bolsista extends Aluno{
    
    // Atributo
    private int bolsa;
    
    // Construtor
    public Bolsista(String nome, String sexo, int idade, String matricula, String curso, int bolsa) {
        super(nome, sexo, idade, matricula, curso);
        this.bolsa = bolsa;
    }

    // Setters and Getters
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override // sobreescrever
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista, pagamento facilitado!");
    }
}