package aula_2;

import java.util.Scanner;

public class Aula2Exercicios {

    public static void main(String[] args) {
        //Questão 1
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Digite um numero inteiro:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Numero é negativo");
        } else if (numero == 0) {
            System.out.println("Numero é igual 0");
        } else {
            System.out.println("Numero é positivo");
        }*/

        //Questão 2
        System.out.println("Digite um número:");
        int entradaUsuario = scanner.nextInt();

        for (int i = 0; i <= entradaUsuario; i++) {
            if (i % 2 == 0) {
                System.out.println("contagem: " + i);
            }
        }
    }
}
