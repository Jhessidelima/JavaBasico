package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 40;
        String nome = "Victor Icoma";
        boolean acompanhado = false;
        double altura = 1.82;
        double peso = 125.7;
        double imc = (peso) / (altura * altura);

        if (idade >= 40) {
            if (imc < 22) {
                System.out.println("IMC= " + imc + " fique atento com sua sub-alimentação.");
            } else if (imc <= 30) {
                System.out.println("IMC= " + imc + " Meus parabéns está em forma.");
            } else if (imc <= 35) {
                System.out.println("IMC= " + imc + " Cuidado está com sobre peso.");
            } else {
                System.out.println("IMC= " + imc + " Esta com obesidade procure um médico.");
            }
        } else {
            if (imc < 25) {
                System.out.println("IMC= " + imc + " Se alimente melhor e cuidado com desnutrição.");
            } else if (imc <= 35) {
                System.out.println("IMC= " + imc + " Meus parabéns está em forma.");
            } else {
                System.out.println("IMC= " + imc + " Planeje alguns exercícios.");
            }
        }

    }
}