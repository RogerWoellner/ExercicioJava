// 2 (valor 0,5) Crie uma classe chamada Funcionario, essa classe deve possuir os seguintes
// atributos privados: nome, salário e cargo do funcionário, e os seguintes métodos.
// • Contrutor;
// • Getters e Setters;
// • calcularImposto() - O valor do imposto deve ser calculado da seguinte forma: se o
// salário for menor ou igual a R$ 1.500,00 o imposto deve ser 5% se o salário for maior
// do que R$ 1.500,00 o imposto será de 10%.
// • exibirFuncionário() – Deve exibir todos os dados do funcionário e qual a % de imposto
// ele vai pagar.

public class Funcionario {
    private String name, cargo;
    private float salario;
    private int imposto;

    public Funcionario(String name, String cargo, float salario){
        this.name = name;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int calcularImposto() {
        if (salario >= 1500) {
            imposto = 10;
        } else {
            imposto = 5;
        }
        return imposto;
    }

    public String imprimir(){
        this.calcularImposto();
        return "O funcionário "+ name +" trabalha como " + cargo + ", recebe um salário de R$ " + salario + " e paga " + imposto+"% em impostos";
    }
    
    public String getName() {
        return name;
    }
    public String getCargo() {
        return cargo;
    }
    public float getSalario() {
        return salario;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }    
}
