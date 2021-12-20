public class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;

    
    // Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // Subscrever
    @Override
    public void like() {
        this.setAvaliacao(this.getAvaliacao() + 1);
        
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void play() {
        this.setReproduzindo(true);    
    }
    

    @Override
    public String toString() {
        return "Video [avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo
                + ", titulo=" + titulo + ", views=" + views + "]";
    }

    // Setters and getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int mediaAvaliacao = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = mediaAvaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    

    
}
