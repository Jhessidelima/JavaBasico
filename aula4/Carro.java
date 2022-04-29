package aula4;
import java.lang.Math;

public class Carro 
{

    //#region Atributos da Classe.
    String marca;
    String modelo;

    int numPassageiro;
    double capCombustiveis;
    double consCombustiveis;
    //#endregion

    //#region Regras de Negócios da Classe Métodos
    public double calculaAutonomia(){
        return Math.round((this.capCombustiveis * this.consCombustiveis));
    }
    //#endregion

}
