public class Livro implements Publicacao{

    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos Abstratos
    
    public String detalhes() {
        return "Livro [aberto=" + aberto + ", \nautor=" + autor + ", \npagAtual=" + pagAtual
                + ", \ntitulo=" + titulo + ", \ntotPaginas=" + totPaginas + ", \nleitor= " 
                + leitor.getNome() +", \nIdade= " + leitor.getIdade()+ ", \nSexo= "+ leitor.getSexo()+"]";
    }
    
    // Métodos Especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        
    }

    @Override
    public void folhear(int pag){
        this.pagAtual = pag;
        if(this.pagAtual > this.getTotPaginas()){
            this.pagAtual = 0;
        }
    }

    

    
}