public class Aluno {
    private String nome;
    private String email;
    private double salario;

    
    //#region Construtores e toString
    public Aluno(String nome, String email, double salario) {
        super();
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    } 

    public Aluno() {
        super();
    }

    @Override
    public String toString() {
        return "Aluno [email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
    }
    //#endregion

    //#region Encapsulamento
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //#endregion

    //#region Regras de Necócios
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        this.setNome(valorSeparado[0]);
        this.setEmail(valorSeparado[1]);
        this.setSalario(Double.parseDouble(valorSeparado[2]));
    }
    //#endregion

}
