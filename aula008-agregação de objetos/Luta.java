import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Abstrados    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if((l1.getCategoria() == l2.getCategoria())&&(l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2); 
        }else{
            if(l1.getCategoria() != l2.getCategoria()){
                System.out.println("Categoria diferentes");
            }else if(l1 == l2){
                System.out.println("Você não pode lutar contra você");
            }
            
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("###### DESAFIADO ######");
            this.desafiado.apresentar();
            System.out.println("##### DESAFIANTE ######");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println("-------- RESULTADO DA LUTA ----------");
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Luta Empatada!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiante ganha
                    System.out.println("Vitoria do "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2: // Desafiado ganha
                    System.out.println("Vitoria do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
