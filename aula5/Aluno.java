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

    private boolean verificaAprovacao(){
        double media = this.calculaMedia();
        if(media >= 7){
            return true;
        }else{
            return false;
        }
    }

    public String montaBoletim(){
        String boletim="Nome do Aluno: "+super.getNome()+System.lineSeparator();
        if(this.verificaAprovacao() == false){
            boletim+=(System.lineSeparator()+
            "Devido a políticas da academia, o boletim está indisponível on-line.");
        }else{
            boletim+=("CPF: "+super.getCpf()+System.lineSeparator()+System.lineSeparator());
            for(int i=0;i<this.notas.length;i++){
                boletim+=((i+1)+" avaliação: "+this.notas[i]+" | "+System.lineSeparator());
            }
            boletim+=("Resultado: Aprovado."+System.lineSeparator());
            boletim+=("Media Final: "+this.calculaMedia()+System.lineSeparator());
        }
        return boletim;
    }
    //#endregion
}
