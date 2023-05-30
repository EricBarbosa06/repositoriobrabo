package Ex1;

import Ex1.Administrativo;
import Ex1.Assistente;
import Ex1.Funcionario;
import Ex1.Tecnico;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Éric", 6500);
        System.out.println();
        Assistente assistente1 = new Assistente("Júlia", 1500, 1603);
        System.out.println();
        Tecnico tecnico1 = new Tecnico("Laura", 2000, 2406, 2000);
        System.out.println();
        Administrativo administrativo1 = new Administrativo("Aline", 5500, 3005, "Manhã", 250);


        funcionario1.addAumento(1100);
        assistente1.addAumento(5000);
        tecnico1.addAumento(800);
        administrativo1.addAumento(250);


        funcionario1.exibeDados();
        System.out.println("Ganho Anual: R$ " + funcionario1.ganhoAnual());

        assistente1.exibeDados();
        System.out.println("Ganho Anual: R$ " + assistente1.ganhoAnual());

        tecnico1.exibeDados();
        System.out.println("Ganho Anual: R$ " + tecnico1.ganhoAnual());

        administrativo1.exibeDados();
        System.out.println("Ganho Anual: R$ " + administrativo1.ganhoAnual());
    }
}