package aula5;
import java.lang.Math;

public class Professor extends Pessoa{
    private double salario;
    private String nomeCurso;

    //#region Encapsulamento [Getters e Setters]
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    //#endregion
    //#region Regras de Negócios
    private double calculaSalario(){
        return Math.round((this.salario * 44)*4.5);
    }
    public String montaHolerite(){
        String holerite;
        holerite=("Nome do Funcionario: "+super.getNome())+System.lineSeparator();
        holerite+=("-------------------------------------------------------------"+System.lineSeparator());
        holerite+=(" | CPF: "+super.getCpf()+System.lineSeparator());
        holerite+=(" | Valor Salario: "+this.calculaSalario()+System.lineSeparator());
        holerite+=(" | Valor hora: "+this.salario+System.lineSeparator());
        holerite+=(" | Curso Referente: "+this.nomeCurso+System.lineSeparator());

        return holerite;
    }
    //#endregion
}
