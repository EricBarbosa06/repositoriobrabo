package Ex1;

import Ex1.Funcionario;

public class Assistente extends Funcionario {
    private int matricula;

public Assistente(String nome, double salario, int matricula){
    super(nome, salario);
    this.matricula = matricula;
}
@Override
    public void exibeDados(){
    super.exibeDados();
    System.out.println("matrícula: "+matricula);
}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
