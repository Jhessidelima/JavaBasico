import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Delta d = new Delta();
        EqXnegativo xn = new EqXnegativo();
        EqXpositivo xp = new EqXpositivo();

        System.out.println("Digite o valor de A:");
        double a = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o valor de B:");
        double b = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o valor de C:");
        double c = Double.parseDouble(entrada.nextLine());

        double dlt = d.calculaDelta(a, b, c);
        System.out.println(d.getA()+"x^2 "+d.getB()+"x "+d.getC()+" = 0");
        
        System.out.println("Delta= "+dlt);
        System.out.println("X| = "+xp.calculaXpositivo(d));
        System.out.println("X||= "+xn.calculaXnegativo(d));
    }
}
