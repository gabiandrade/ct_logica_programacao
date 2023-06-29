package aula_3;

public class Funcoes {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void iniciar() {
        System.out.println("Bem vindos!");
    }

    public static boolean isPar(int num) {
        return num % 2 == 0;

    }

    public static void main(String[] args) {
        //Inicia o programa
        iniciar();

        //Soma dois numeros
        int resultado = somar(1,3);
        System.out.println(resultado);

        //Soma tres numeros
        System.out.println(somar(4,2,1));

        int num = 5;
        //Verifica se o numero é par e retorna true or false
        System.out.println(isPar(num));

        if(isPar(num)) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é ímpar");
        }
    }

}
