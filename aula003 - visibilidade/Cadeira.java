public class Cadeira {
    String tipo, tamanho, cor, forma;
    boolean sentado;   

    void status(){
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Forma: "+ this.forma);
        System.out.println("Está sentado: "+ this.sentado);

    }

    void sentar(){
        this.sentado = true;
    }

    void levantar(){
        this.sentado = false;

    }
}
