import java.util.Arrays;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String cpf;

    
    //#region Construtores e toString 

    public Aluno(String nome, String email, double salario, String cpf) {
        super();
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Aluno() {
        super();
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
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
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //#endregion

    //#region Regras de Necócios
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        this.setNome(valorSeparado[0]);
        this.setEmail(valorSeparado[1]);
        this.setSalario(Double.parseDouble(valorSeparado[2]));
        this.setCpf(valorSeparado[3]);
    }

    public void validaCpf(){
        String cpf = this.getCpf();
        String[] sep = cpf.split("-");
        System.out.println(sep[0]);
        System.out.println(sep[1]);

        String campos = sep[0];
        System.out.println(sep[0]);
        String trocaPonto = campos.replace(".", ";");
        System.out.println(trocaPonto);
        String[] sepCampos = trocaPonto.split(";");
        int c1 = Integer.parseInt(sepCampos[0]);
        int c2 = Integer.parseInt(sepCampos[1]);
        int c3 = Integer.parseInt(sepCampos[2]);

        System.out.println("c1: "+c1+"c2: "+c2+"c3: "+c3);
    }
    //#endregion

}
