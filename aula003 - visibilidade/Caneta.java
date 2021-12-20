public class Caneta {
    public String modelo;
    public String cor;
    private float ponta = 0.5f;
    private int carga = 100;
    private boolean tampada = true;

    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO não posso rasbiscar, a caneta está tampada!");
        }else{
            System.out.println("Rabiscando...");
        }

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void escrever(){
        if(this.carga > 0 && this.tampada == false){
            System.out.println("Escrevendo.....");
        }else{
            System.out.println("ERRO! A caneta está tampada ou sem tinta");
        }
    }
}
