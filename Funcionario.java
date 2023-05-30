package Ex1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }
    public void addAumento(double valor){
        salario += valor;
    }
    public double ganhoAnual() {
        return salario * 12;
    }

    public void exibeDados(){
        System.out.println("nome: "+ nome);
        System.out.println("salario: r$ "+ salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
