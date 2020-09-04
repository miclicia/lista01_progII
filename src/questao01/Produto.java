package questao01;

public class Produto {
    //atributos
    private String nome;
    private int codigo;

    //construtores
    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    public Produto(){
        //vazio
    }

    //metodos

    public String getNome() {
        return nome;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }
}

