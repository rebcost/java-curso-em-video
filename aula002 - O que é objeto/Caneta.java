public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO não posso rasbiscar, a caneta está tampada!");
        }else{
            System.out.println("Rabiscando...");
        }

    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void escrever(){
        if(this.carga > 0 && this.tampada == false){
            System.out.println("Escrevendo.....");
        }else{
            System.out.println("ERRO! A caneta está tampada ou sem tinta");
        }
    }
}
