public class Caneta {
    private String modelo,cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String cor, String modelo, float ponta){
        this.tampar();
        this.setCor(cor);
        this.setModelo(modelo);
        this.setPonta(ponta);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void status() {
        System.out.println("Cor: "+this.getCor());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Está tampada?: "+this.isTampada());
    }
}    