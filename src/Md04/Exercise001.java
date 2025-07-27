package Md04;

import java.util.Scanner;

public class Exercise001 {
    public static void main(String[] args) {

        //Sistema de trânsito. Crie um progrma que leia a cor que o usuário digitar
        //Enquanto a cor não for verde os carros podem continuar passando.

        Scanner scanner = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Qual é a cor do sinal?");
            resposta = scanner.nextLine();
            System.out.println("Os carros estão passando!");
        } while (resposta.equalsIgnoreCase("verde"));

        System.out.println("Hora de parar! ");
    }
}
