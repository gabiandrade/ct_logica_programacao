package aula_2;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruta;
        for (
                int i = 0;
                i <= 1; i++) {
            System.out.println("Digite nome da fruta");
            fruta = scanner.nextLine();
            System.out.println(fruta);
        }
        boolean matriculaAtiva = true;
        while (matriculaAtiva) {
            System.out.println("A matricula do aluno está ativa");
            matriculaAtiva = false;
        }

        int i = 0;
        while (i > 0) {
            System.out.println("entrou no while");
        }

        do {
            System.out.println("Contagem: " + i);
        } while (i > 1);

        System.out.println("-----Cadastro------");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " e sua altura " + altura);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        System.out.println(letra);
        scanner.nextLine();

        System.out.println("Digite sua linguagem favorita: [JAVA, PYTHON, HTML]");
        String linguagem = scanner.nextLine();

        if (linguagem.equalsIgnoreCase("JAVA")) {
            System.out.println("Melhor linguagem de Programação");
        } else if (linguagem.equalsIgnoreCase("PYTHON")) {
            System.out.println("Melhor linguagem para aprender programação");
        } else {
            System.out.println("Linguagem de programação não encontrada");
        }

        System.out.println("Digite o mês do seu aniversário em número: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Linguagem de programação não encontrada");
                break;
        }

        scanner.close();
    }

}
