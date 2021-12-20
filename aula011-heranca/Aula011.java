class Aula011{
    public static void main(String[] args) {
        Aluno a = new Aluno("Claudio", "M", 19, "11111", "Informática");
        Bolsista b = new Bolsista("Thiago", "M", 22, "12222", "Mecânica", 50);
        Professor f = new Professor("Marcela", "F", 32, "Algoritmos", 2000.0f);
        Visitante v = new Visitante("Ana", "F", 16);
        Tecnico t = new Tecnico("Caio", "M", 20, "22222", "Edificações", "ED0001");

        a.pagarMensalidade();
        a.fazerAniver();
        System.out.println(a.toString());

        b.pagarMensalidade();
        System.out.println(b.toString());

        f.receberAumento(500);
        f.fazerAniver();
        System.out.println(f.toString());

        t.praticar();
        System.out.println(f.toString());

        System.out.println(v.toString());
        
    }
}