package aula4;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustiveis = 76;
        van.numPassageiro = 10;
        van.consCombustiveis = 8.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustiveis = 42;
        fusca.numPassageiro = 5;
        fusca.consCombustiveis = 7.4;

        System.out.println("Informe o indice do eco desempenhop do seu estado?");
        double indice = Double.parseDouble(entrada.nextLine());

        System.out.println(van);
        //Modelo do Carro | Autonomia do Carro
        System.out.println("Modelo: "+van.modelo+" | Autonomia: "+van.calculaAutonomia());
        System.out.println("Eco Taxa: "+van.verificaEcoDesempenho(indice));
        System.out.println("Eco desempenho: ");
        System.out.println(fusca);
        //Modelo do Carro | Autonomia do Carro
        System.out.println("Modelo: "+fusca.modelo+" | Autonomia: "+fusca.calculaAutonomia());
        System.out.println("Eco Taxa: "+fusca.verificaEcoDesempenho(indice));
        System.out.println("Eco desempenho: ");
    }
    
}
