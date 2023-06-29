package aula_3;

import java.util.Scanner;

public class Arrays {
    /*Perguntar ao usuario a quantidade de elementos que ele vai
     * colocar no carrinho
     * Depois perguntar nome da fruta.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de itens?");
        int quantidade = scanner.nextInt();
        String[] listaDeCompras = new String[quantidade];
        System.out.println(java.util.Arrays.toString(listaDeCompras));
        scanner.nextLine();

        /*for(int i=0; i<listaDeCompras.length; i++){
            System.out.println("Digite o nome do item de supermercado que queira adicionar:");
            String produto =  scanner.nextLine();
            listaDeCompras[i] = produto;
        }
        System.out.println(Arrays.toString(listaDeCompras));


        int contador = 0;
        while(contador < listaDeCompras.length){
            System.out.println("Digite o nome do item de supermercado que queira adicionar:");
            String produto =  scanner.nextLine();
            listaDeCompras[contador] = produto;
            contador++;
        }

        System.out.println(Arrays.toString(listaDeCompras));*/
        //5
        int contador = 0;
        char entrada;
        do {
            System.out.println("Digite o nome do item de supermercado que queira adicionar:");
            String item = scanner.nextLine();
            listaDeCompras[contador] = item;
            contador++;
            if (contador < listaDeCompras.length) {
                System.out.println("Deseja adicionar outro item? [S] [N]");
                entrada = scanner.next().charAt(0);
                scanner.nextLine();
                if (entrada == 'N') {
                    System.out.println("Tchau.");
                    break;
                }
            }
        } while (contador < listaDeCompras.length);

        System.out.println(java.util.Arrays.toString(listaDeCompras));





        /*int[] listaNumerica = new int[5];
        //String[] nomes = {"Adir", "Brena", "Bruno"};
        listaNumerica[0]=1;
        listaNumerica[1]=3;
        listaNumerica[2]=5;
        listaNumerica[3]=7;
        listaNumerica[4]=9;
        //System.out.println(listaNumerica[1]);

        /*for(int i=0; i < listaNumerica.length; i++) {
            System.out.println(listaNumerica[i]);
        }*/

        /*String[] nomes = {"Adir", "Brena", "Bruno"};
        for(String elemento: nomes){
            System.out.println(elemento);
        }*/

        //System.out.println(Arrays.toString(listaNumerica));
    }
}
