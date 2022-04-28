package aula3;

import java.util.ArrayList;
import java.util.List;

public class listas {

    public static void main(String[] args) {

        List lista1 = new ArrayList<Integer>();

        lista1.add("arroz");
        lista1.add("bolacha");
        lista1.add("margarina");
        lista1.add("leite");
        lista1.add("massas");

        System.out.println("--- [Lista sem alterações] --- ");
        System.out.println(lista1);
        System.out.println("--- [Lista com alterações] --- ");
        lista1.set(2, "manteiga");
        System.out.println(lista1);
        System.out.println("--- [Lista com Remoções] --- ");
        lista1.remove(2);
        System.out.println(lista1);  
    }
}
