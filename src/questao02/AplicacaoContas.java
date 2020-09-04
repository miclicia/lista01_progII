package questao02;

import java.util.*;

public class AplicacaoContas {

    public static String lerTeclado() {
        return new Scanner(System.in).nextLine();
    }
    public static List<ContaCorrente> listaContaCorrente = new ArrayList<ContaCorrente>();

    public static String menu(){
        System.out.println("********** MENU **********");
        System.out.println("Digite 0 para login.");
        System.out.println("Digite 1 para obter os dados da conta.");
        System.out.println("Digite 2 realizar deposito.");
        System.out.println("Digite 3 realizar saque.");
        System.out.println("Digite 4 realizar transferência.");
        System.out.println("Digite: ");
        return AplicacaoContas.lerTeclado();
    }
    //i. Imprimir dados de uma conta: Para esta opção o usuário deverá informar o número da conta;
    public static void imprimeConta(){
        ContaCorrente contaCorrente = obterDadosConta();
        if (contaCorrente != null){
            System.out.println("\n****** Informações da Conta ******");
            System.out.println("O numero da conta é: " + contaCorrente.getNumeroConta());
            System.out.println("O correntista é: " + contaCorrente.getCorrentista());
            System.out.println("O saldo da conta é: R$" + contaCorrente.getSaldo());
            System.out.println("****** --------------------- ******\n");
        } else {
            System.out.println("Conta não encontrada.\n");
        }
    }


    public static void login (){
        System.out.println("\nAplicação Conta\n");
        System.out.println("Digite sua conta:");
        int numeroConta = Integer.valueOf(AplicacaoContas.lerTeclado());
        System.out.println("Digite o número correntista:");
        String correntista = AplicacaoContas.lerTeclado();
        listaContaCorrente.add(new ContaCorrente(numeroConta, correntista));
    }
    public static ContaCorrente obterDadosConta() {
        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.valueOf(lerTeclado());
        for (int i = 0; i < listaContaCorrente.size(); i++) {
            ContaCorrente cc = listaContaCorrente.get(i);
            if (cc.getNumeroConta() == numeroConta) {
                return cc;
            }
        }
        return null;
    }


    public static void realizarDeposito(){
        ContaCorrente contaCorrente = obterDadosConta();
        if (contaCorrente != null){
            System.out.println("Digite valor deposito: ");
            double deposito = Double.valueOf(AplicacaoContas.lerTeclado());
            if (contaCorrente.depositar(deposito)) {
                System.out.println("Deposito realizado! \n");
            } else {
                System.out.println("Deposito não realizado\n!");
            }
        } else {
            System.out.println("Conta não encontrada. \n");
        }
    }

    public static void realizarSaque(){
        ContaCorrente contaCorrente = obterDadosConta();

        if (contaCorrente != null){
            System.out.println("Digite valor de saque: ");
            double saque = Double.valueOf(AplicacaoContas.lerTeclado());
            contaCorrente.saca(saque);
        } else {
            System.out.println("Conta não encontrada. \n");
        }

    }
    public static void realizarTransferencia() {
        ContaCorrente contaCorrente1 = obterDadosConta();
        ContaCorrente contaCorrente2 = obterDadosConta();
        if (contaCorrente1 != null && contaCorrente2 != null) {
            System.out.println("Digite valor transferência:");
            double transferencia = Double.valueOf((AplicacaoContas.lerTeclado()));
            contaCorrente1.transfere(transferencia, contaCorrente2);
        } else {
            System.out.println("Conta não encontrada.\n");
        }
    }
    //não pode escrever metodo dentro do main
    public static void main (String[] args){

       System.out.println("Aplicação Contas");
       while (true) {
           int opcao = Integer.valueOf(AplicacaoContas.menu());
           if (opcao == 0){
               login();
           }else if (opcao == 1) {
               imprimeConta();
           }else if (opcao == 2){
               realizarDeposito();
           }else if (opcao == 3){
               realizarSaque();
           }else if (opcao == 4){
               realizarDeposito();
           }else if (opcao == 5){
               realizarTransferencia();
           }
       }


    }
}
