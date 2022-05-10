import java.util.Arrays;
import java.util.Scanner;

public class executor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno a1 = new Aluno();

        Wrapper ts = new Wrapper();

        System.out.println(ts.num8);
        System.out.println(ts.num9);
        System.out.println(ts.num10);
        System.out.println(ts.flag2);
        System.out.println(ts.b);
        System.out.println(ts.num11);

        System.out.println("Digite as informações do aluno separado por [;]:");
        String valor=entrada.nextLine();
        a1.guardaAluno(valor);
        System.out.println(a1);
        a1.validaCpf();
    }
}
