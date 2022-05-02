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

    public double verificaEcoDesempenho(){
        double eco = this.calculaAutonomia()/this.numPassageiro;
        return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice){
        if(this.verificaEcoDesempenho()>indice){
            return true;
        }else{
            return false;
        }
    }
    // Você deverá entregar um boolean no código principal, e como desafio deverá traduzir este boolean em
    //Eco eficiênte ou Não é eco eficiêncte.
    //#endregion

}
