package questao01;

public class Estoque {
    //atributos
    private int qtdAtual;
    private int qtdMinima;
    private Produto produto;
    //construtor
    public Estoque(){
        //Vazio
    }

    public Estoque(int qtdAtual, int qtdMinima, Produto produto) {
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        this.produto = produto;
    }
    //métodos


    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void reporEstoque(int qtd){
        this.qtdAtual = qtdAtual + qtd;
    }

    public void darBaixa(int qtd){
        this.qtdAtual = qtdAtual - qtd;
    }

    public String relatorio(){
        return "Nome do produto: " + produto.getNome() + "\nQuantidade Atual: " + getQtdAtual()+ "\nQuantidade Minima: " + getQtdMinima();
    }

}
