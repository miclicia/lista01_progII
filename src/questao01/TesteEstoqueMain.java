package questao01;

public class TesteEstoqueMain {
    public static void main (String[] args){
        Produto produto01 = new Produto("Impressora", 1);
        Produto produto02 = new Produto("Teclado", 2);
        Produto produto03 = new Produto("Monitor", 3);
        Estoque estoque1 = new Estoque(10,2, produto01);
        Estoque estoque2 = new Estoque(20,10, produto02);
        Estoque estoque3 = new Estoque(5,2, produto03);

        //- Dar baixa em 5 unidades de estoque1;
        estoque1.darBaixa(5);
        //- Fazer a reposição de 7 unidades de estoque2;
        estoque2.reporEstoque(7);
        //- Dar baixa em 6 unidades de estoque3;
        estoque3.darBaixa(6);
        //- Executar o método relatorio das instâncias estoque1, estoque2 e estoque3;
        System.out.println(estoque1.relatorio()+"\n");
        System.out.println(estoque2.relatorio()+"\n");
        System.out.println(estoque3.relatorio()+"\n");
        //- Mudar o nome do produto02 para "Teclado virtual";
        produto02.mudarNome("Teclado Virtual");
        //- Executar o método relatorio da instância de estoque responsável pelo atributo
        //produto02;
        System.out.println(estoque2.relatorio());

    }






}
