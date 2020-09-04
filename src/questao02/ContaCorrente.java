package questao02;

public class ContaCorrente {
    //Atributos
    private int numeroConta;
    private String correntista;
    private double saldo;

    //Construtor

    public ContaCorrente(int numeroConta, String correntista){
        this.setNumeroConta(numeroConta);
        this.setCorrentista(correntista);
    }


    //Métodos que vão definir os valores dos atributos
    public void setNumeroConta (int val){
        if (val < 0 || val == 0){
            return;
        }
        this.numeroConta = val;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

public void setCorrentista (String val){
        if (val == null || val.equals("")) {
            return;//.equal vazio
        }
        this.correntista = val;
}

public String getCorrentista(){
    return this.correntista;
}

public double getSaldo (){
    return this.saldo;
}
//criar os metodos

public boolean depositar (double valor){
    if (valor >0){
        this.saldo += valor;
        return true;
    }
    return false;
}

public boolean saca (double valor){
    if (valor > 0 && this.saldo >= valor){
        this.saldo -=valor;
        return true;
    }
    return false;
}

public boolean transfere (double valor, ContaCorrente contaDestino){
    if (valor > 0 && contaDestino != null){
        if(this.saca(valor)){
           if (contaDestino.depositar(valor)){
               return true;
           }
        }
    }
    return false;
}
}