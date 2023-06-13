// PROVA 1 (Valor 2 Pontos)
// 1 (valor 0,5) Crie uma classe chamada Produto, essa classe deve possuir os seguintes atributos
// privados: nome, preço e quantidade disponível no estoque do produto, e os seguintes
// métodos.
// • Construtor;
// • Getter e Setters;
// • venderProduto() – Deve diminuir a quantidade do estoque do produto.
// • exibirProduto() – Deve exibir os dados do produto;

public class Produto {
    private String name;
    private int qtde;
    private float price;


    public Produto(String name, int qtde, float price){
        this.name = name;
        this.qtde = qtde;
        this.price = price;
    }


    public boolean venderProduto(int qtde) {
        this.qtde -= qtde;
        return true;
    }

    public String imprimir(){
        return "O produto "+ name +" tem em estoque " + qtde + " unidades e está sendo vendido pelo preço de R$ " + price;
    }

    public String getName() {
        return name;
    }
    public int getQtde() {
        return qtde;
    }
    public float getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public void setPrice(float price) {
        this.price = price;
    }    
}
