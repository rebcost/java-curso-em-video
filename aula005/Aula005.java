public class Aula005 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);        
        p1.setDono("Filipe");
        p1.abrirConta("CC");        
        p1.estadoAtual();
        
    }
}
