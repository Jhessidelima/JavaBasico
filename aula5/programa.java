package aula5;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Almir Carrara");
        p1.setEndereco("Rua das Flores, 230");
        p1.setTelefone("(045)988582767");
        p1.setCpf("225.751.85.-54");
        p1.setNomeCurso("Java Spring");
        p1.setSalario(45.6);

        a1.setNome("Sergio Bona Ventura");
        a1.setEndereco("Rua dos Alfeneiros, 50");
        a1.setTelefone("(085)997852356");
        a1.setCpf("524.214.16.-04");
        a1.setCurso("Java Spring");
        double[] notas = {3.5,4.5,5.5,6.3};
        a1.setNotas(notas);

        System.out.println(p1.montaHolerite());
        System.out.println(a1.montaBoletim());
    }
}
