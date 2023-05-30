package Ex1;

import Ex1.Assistente;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;
    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }
@Override
    public double ganhoAnual(){
        return super.ganhoAnual() + adicionalNoturno;
}

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
}
