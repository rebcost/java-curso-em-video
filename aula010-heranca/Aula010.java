public class Aula010 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor pf = new Professor();
        Funcionario f = new Funcionario();

        p.setNome("Filipe");
        a.setNome("João");
        pf.setNome("Cláudio");
        f.setNome("Maria");

        a.setCurso("Informática");
        pf.setSalario(2000.0f);
        f.setSetor("Almoxarifado");

        
        System.out.println(a.toString());
        System.out.println(p.toString());
        System.out.println(pf.toString());
        System.out.println(f.toString());

    }
}
