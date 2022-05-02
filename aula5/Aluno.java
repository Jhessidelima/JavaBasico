package aula5;

public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;

    //#region Encapsulamento [Getters e Setters]
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double[] getNotas() {
        return notas;
    }
    //#endregion

    //#region Regras de Negócios
    private double calculaMedia(){
        double media=0;
        for(int i=0; i<this.notas.length;i++){
            media+=notas[i];
        }
        return (media/notas.length);
    }

    public boolean verificaAprovacao(){
        return true;
    }

    public String montaBoletim(){
        String boletim="Nome do Aluno: "+super.getNome();
        return boletim;
    }
    //#endregion
}
