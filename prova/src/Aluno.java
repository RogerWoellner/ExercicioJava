// 3 (valor 1) Crie uma classe chamada Aluno, essa classe deve possuir os seguintes atributos
// privados: nome, idade, nota1, nota2, média das notas, e os seguintes métodos.
// • Construtor – o construtor não deve receber ou calcular a média;
// • Getters e Setters ;
// o Ao receber as notas deve ser verificado se a nota recebida é maior do que a
// nota existente, a maior nota precisa ser mantida;
// o Ao utilizar set de média o método deve verificar se a média informada é igual
// a média das notas cadastradas e deve emitir um aviso caso não seja.
// • calcularMedia() – O método deve calcular a média do aluno ((nota1 +nota2) / 2);
// • status() – O método deve mostrar se o aluno foi aprovado (nota >= 7) se ele está de
// final (nota >=2 ) ou se ele está reprovado direto (nota < 2);



public class Aluno {
    
    private String nome;
    private int idade;
    private double nota1, nota2, media;
    
    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota1(double nota1) {
        if (nota1 > this.nota1) {
            this.nota1 = nota1;
        }
    }
    
    public double getNota2() {
        return nota2;
    }
    
    public void setNota2(double nota2) {
        if (nota2 > this.nota2) {
            this.nota2 = nota2;
        }
    }
    
    public double getMedia() {
        return media;
    }
    
    public void setMedia(double media) {
        if (media != calcularMedia()) {
            System.out.println("A média informada é diferente da média calculada a partir das notas cadastradas.");
        } else {
            this.media = media;
        }
    }
    
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
    
    public String imprimir() {
        if (calcularMedia() >= 7.0) {
            return "O aluno " + nome + " foi aprovado.";
        } else if (calcularMedia() >= 2.0) {
            return "O aluno " + nome + " está na final.";
        } else {
            return "O aluno " + nome + " foi reprovado";
        }
    }
    
}

