public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos especiais
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,  int vitorias,
            int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);        
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();        
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Peso Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos Abstratos

    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Pesando: "+this.getPeso()+" kg");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println("\n\n");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
