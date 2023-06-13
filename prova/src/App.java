import java.util.ArrayList;
import java.util.List;

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


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício 1");

        Produto p1 = new Produto("carteira", 150, 70);
        p1.venderProduto(50);
        System.out.println(p1.imprimir());

        System.out.println("Exercício 2");

        Funcionario f1 = new Funcionario("João", "Contador", 1500);

        System.out.println(f1.imprimir());

        System.out.println("Exercício 3");
        
        Aluno a1 = new Aluno("João", 25, 7, 8);

        System.out.println(a1.imprimir());

        System.out.println("Trabalhando com ArrayList");

        List<Integer> lista = new ArrayList<Integer>();



        List<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(aluno);
        System.out.println(alunos.get(0).getNome());

        System.out.println("tamanho do vetor" + lista.size);


    }   
}
