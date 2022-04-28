package aula2;

public class para {
    public static void main(String[] args) {
        int limite = 50;
        int tabuadas = 30;

        for (int j = 1; j <= tabuadas; j++) {
            System.out.println("Tabuada do: " + j);
            for (int i = 1; i <= limite; i++) {
                System.out.println(j + " x " + i + "= " + (j * i));
            }
        }
    }
}
