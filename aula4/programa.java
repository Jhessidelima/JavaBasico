package aula4;

public class programa {

    public static void main(String[] args) {
        
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

        System.out.println(van);
        //Modelo do Carro | Autonomia do Carro
        System.out.println("Modelo: "+van.modelo+" | Autonomia: "+van.calculaAutonomia());
        System.out.println(fusca);
        //Modelo do Carro | Autonomia do Carro
        System.out.println("Modelo: "+fusca.modelo+" | Autonomia: "+fusca.calculaAutonomia());

    }
    
}
