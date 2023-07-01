package aula_4;

public class Matriz {

    public static void main(String[] args) {
          /*Escreva um programa em Java que recebe duas matrizes de tamanho 3x3
        como entrada e calcula a soma das duas matrizes.
        Em seguida, exiba a matriz resultante.

        exemplo MATRIZ 1:
        1 2 3
        4 5 6
        7 8 9

        exemplo MATRIZ 2:
        9 8 7
        6 5 4
        3 2 1

        SAIDA RESULTANTE:
        10 10 10
        10 10 10
        10 10 10
     */

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matriz 1");
        for (
                int i = 0;
                i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                int resultado = matriz1[i][j];
                System.out.print(resultado + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2");
        for (
                int i = 0;
                i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                int resultado = matriz2[i][j];
                System.out.print(resultado + " ");
            }
            System.out.println();
        }

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int[][] matrizResultado = new int[linhas][colunas];

        System.out.println("Matriz Resultado");

        for (
                int i = 0;
                i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                int resultado = matriz1[i][j] + matriz2[i][j];
                matrizResultado[i][j] = resultado;
                System.out.print(resultado + " ");
            }
            System.out.println();
        }



        /*int[][] matriz = new int[2][2];
        matriz[0][0]= 25;
        matriz[0][1]= 45;
        matriz[1][0]= 30;
        matriz[1][1]= 63;

        int[][] matrizPreenchida = {{1,2,1,2},{3,4,3,4},{5,6,5,6},{7,8,7,8}};
        System.out.print("Matriz vazia" + Arrays.deepToString(matriz));
        System.out.println();

        for (int i=0; i<matrizPreenchida.length; i++) {
            for (int j=0; j<matrizPreenchida[i].length; j++){
                int resultado = matrizPreenchida[i][j];
                System.out.print(resultado + " ");
            }
            System.out.println();
        }
    }*/

    /*
    * [3] -> linhas
      [2] -> colunas
         String[][] matriz = new String[3][2];

        Posições Colunas
                   0                 1                3
         [ [null, null], [null, null], [null, null]]

        Posições Linhas
             0      1         0      1        0      1
         [ [null, null], [null, null], [null, null]]
    * */
    }

}
