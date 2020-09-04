package questao03;

import java.util.*;

public class AplicacaoDvd {
    public static String lerTeclado() {
        return new Scanner(System.in).nextLine();
    }
    public static String menu(){
        System.out.println("********** MENU **********");
        System.out.println("Digite 0 para DESLIGAR.");
        System.out.println("Digite 1 para LIGAR.");
        System.out.println("Digite 2 para PLAY.");
        System.out.println("Digite 3 para STOP.");
        System.out.println("Digite 4 para PAUSE.");
        System.out.println("Digite 5 para VOLTA.");
        System.out.println("Digite 6 para AVANCAR.");
        System.out.println("Digite: ");
        return AplicacaoDvd.lerTeclado();
    }



    public static void main (String[] args){
        Dvd dvd = new Dvd();
        System.out.println("Aplicação Contas");
        while (true) {
            int opcao = Integer.valueOf(AplicacaoDvd.menu());

            if (opcao == 0){
                dvd.desligar();
            }else if (opcao == 1) {
                dvd.ligar();
            }else if (opcao == 2){
                dvd.play();
            }else if (opcao == 3){
                dvd.stop();
            }else if (opcao == 4){
                dvd.pause();
            }else if (opcao == 5){
                dvd.volta();
            }
            else if (opcao == 6){
                dvd.avanca();
            } if (dvd.isEstado() == true) {
                System.out.println("O estado é: LIGADO");
            } else {
                System.out.println("O estado é: DESLIGADO");
            }
            System.out.println("A operação é: " + dvd.getOperacaoEmExecucao());

        }


    }



}
