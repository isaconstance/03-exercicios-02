package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Funcionario[] funcionario = new Funcionario[3];
        String nome, cargo;
        double salario;

        // gerando 3 objetos
        for(int i = 0; i < funcionario.length; i++){
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Cargo: ");
            cargo = sc.next();
            System.out.print("Salário: ");
            salario = sc.nextDouble();

            funcionario[i] = new Funcionario(nome, cargo, salario);
            System.out.println();
        }

        // saida de dados
        for (int i = 0; i < funcionario.length; i++){
            System.out.println(funcionario[i]);
        }



}
}
