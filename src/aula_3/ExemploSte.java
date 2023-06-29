package aula_3;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploSte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de items que queira adicionar: ");
        int qtdItem = sc.nextInt();

        String[] listaDeCompras = new String[qtdItem];
        int contador = 0;

        do{
            System.out.println("Digite o nome do item de supermercado que queira adicionar: ");
            String item = sc.nextLine();

            listaDeCompras[contador] = item;
            contador++;
        }
        while(contador < qtdItem);

        System.out.println(Arrays.toString(listaDeCompras));
    }
}

