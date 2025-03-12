package exercicio04;

public class Funcionario {
    // variáveis de instância ou atributos
    String nome;
    String cargo;
    double salario;

    // método construtor para inicializar os atributos do objeto
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // método para aumentar o salário de acordo com uma porcentagem
    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    // método para aumentar o salário de acordo com uma porcentagem
    // e de acordo com o cargo
    public void aumentarSalario(String cargo, double porcentagem) {
        if(this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * porcentagem / 100;
        }
    }

    // método para promover um funcionário --> alterar o cargo
    public void promover(String novoCargo) {
        cargo = novoCargo;
    }

}
