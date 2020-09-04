package questao03;

public class Dvd {
    //Atributos
    private boolean estado;
    private String OperacaoEmExecucao;


// variáveis

    public boolean ligado = true;
    public boolean desligado = false;
    public String parado;
    public String reproduzindo = "Reproduzindo DVD...";
    public String emPausa = "Reprodução do DVD em pausa...";
    public String voltando = "Voltando o DVD...";
    public String avancando = "Avancando o DVD...";

//Construtor

    public boolean Dvd (boolean estado, String operacaoEmExecucao) {
    this.OperacaoEmExecucao = getOperacaoEmExecucao();
    this.estado = this.isLigado();
        return estado;
    }

//metodo para os atributos


    public boolean isEstado() {
        return estado;
    }

    public String getOperacaoEmExecucao() {
        return OperacaoEmExecucao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public String getParado() {
        return parado;
    }

    public String getReproduzindo() {
        return reproduzindo;
    }

    public String getEmPausa() {
        return emPausa;
    }

    public String getVoltando() {
        return voltando;
    }

    public String getAvancando() {
        return avancando;
    }
    public void ligar(){
        this.estado = isLigado();
        this.OperacaoEmExecucao = this.parado;
    }

    public void desligar(){
        this.estado = isDesligado();
        this.OperacaoEmExecucao = this.parado;
    }

    public void play(){
        if (this.estado == true){
            this.OperacaoEmExecucao = this.reproduzindo;
        }
    }
    public void stop(){
        if (this.estado == true){
            this.OperacaoEmExecucao = this.parado;
        }
    }
    public void pause(){
        if (this.estado == true){
            this.OperacaoEmExecucao = this.emPausa;
        }
    }
    public void volta(){
        if (this.estado == true){
            this.OperacaoEmExecucao = this.voltando;
        }
    }
    public void avanca(){
        if (this.estado == true){
            this.OperacaoEmExecucao = this.avancando;
        }
    }
}