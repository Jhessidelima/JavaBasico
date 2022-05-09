import java.util.Arrays;

public class executor {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        Wrapper ts = new Wrapper();

        System.out.println(ts.num8);
        System.out.println(ts.num9);
        System.out.println(ts.num10);
        System.out.println(ts.flag2);
        System.out.println(ts.b);
        System.out.println(ts.num11);

        String valor="Mariano;mariano.pereira@gmail.com;1500";
        a1.guardaAluno(valor);
        System.out.println(a1);
    }
}
