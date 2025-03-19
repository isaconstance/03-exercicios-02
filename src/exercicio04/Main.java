package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Funcionario[] funcionario = new Funcionario[5];
    static int index = 0; // index = contador


    public static void main(String[] args) {

        int opcao;

        do{
            System.out.println("Escolha uma opção");
            System.out.println("1. Cadastrar");
            System.out.println("2. Pesquisar");
            System.out.println("3. Listar");
            System.out.println("4. Finalizar");
            opcao = sc.nextInt();
            if(opcao < 1 || opcao > 4){
                System.out.println("opção inválida");
            }
            else{
                switch (opcao){
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        listar();
                }
            }
            System.out.println();
        }while(opcao != 4);

    }

    public static void cadastrar(){
        String nome, cargo;
        double salario;
        if (index < funcionario.length){
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Cargo: ");
            cargo = sc.next();
            System.out.print("Salário: ");
            salario = sc.nextDouble();
            funcionario[index] = new Funcionario(nome, cargo, salario);
            index++;
        }
    }
    public static void pesquisar(){
        String nome;
        System.out.print("Nome para pesquisa: ");
        nome = sc.next();
        for (int i = 0; i < index; i++){
            if(funcionario[i].nome.equalsIgnoreCase(nome)){
                System.out.println(nome + " encontrado");
                return; // parar o método
            }
        }
        System.out.println(nome + "não encontrado :(");
    }
    public static void listar(){
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < index; i++) {
            System.out.println("Nome: " + funcionario[i].nome);
            System.out.println("Cargo: " + funcionario[i].cargo);
            System.out.println("Salário: R$ " + df.format(funcionario[i].salario));
            System.out.println();
        }
    }
}
