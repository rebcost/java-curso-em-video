public class ControleRemoto implements Controlador{
    // Definindo os atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Especiais

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando?"+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.printf("[]");
        }
        System.out.println("\n");    
    }

    @Override
    public void desligar() {        
        this.setLigado(false);
        System.out.println("DESLIGANDO........");
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("MUDO DESLIGADO");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu......");
        
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("LIGANDO........");
        
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("MUDO");
        }else{
            System.out.println("TV está em MUDO, aperte desligar desligar mudo");
        }
        
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() - 5);
        }
        
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Pause....");
        }else{
            System.out.println("TV já está em Pause, Aperte play para continuar");
        }
    }
    
    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Reproduzindo....");
        }
        
        
    }

    
}
