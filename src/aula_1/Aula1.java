package aula_1;

/*
 * Os tipos primitivos em Java são tipos de dados básicos que
 * representam valores simples.
 * Existem oito tipos primitivos em Java:
 * boolean
 * byte
 * short
 * int
 * long
 * float
 * double
 * char
 */
public class Aula1 {
    public static void main(String[] args) {
        //`boolean`: Representa valores booleanos, ou seja, verdadeiro (`true`) ou falso (`false`).
        boolean matriculaAlunoAtiva = true;
        boolean alunoPresenteNaAula = false;

        //`byte`: Armazena números inteiros de 8 bits.
        byte idade = 25;

        //`short`: Armazena números inteiros de 16 bits.
        short populacao = 30000;

        //`int`:Armazena números inteiros de 32 bits.É o tipo mais comumente usado para números inteiros.
        int quantidade = 100;

        //`long`: Armazena números inteiros de 64 bits. Para representar valores longos, é necessário adicionar um sufixo "L" ao valor.
        long populacaoMundial = 7800000000L;

        //`float`: Armazena números de ponto flutuante de precisão simples, com 32 bits. Para representar valores do tipo `float`, é necessário adicionar um sufixo "f" ao valor.           ```java*/
        float altura = 1.75f;

        //`double`: Armazena números de ponto flutuante de precisão dupla, com 64 bits. É o tipo mais comumente usado para números decimais.
        double peso = 68.5;

        // `char`: Armazena caracteres Unicode de 16 bits.
        char letra = 'A';
        char escolhaDoJogador = 'X';

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("Matricula ativa? %b%n", matriculaAlunoAtiva);
        System.out.println("Aluno esteve na aula? " + alunoPresenteNaAula);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Altura: %.2f%n", altura);
        System.out.printf("População: %d%nPopulação Mundial Long: %d%n", populacao, populacaoMundial);
        System.out.println("Quantidade: " + quantidade);
        System.out.print("Peso: " + peso + "\n");
        System.out.printf("Letra: %c%n", letra);
        System.out.println("Escolha do Jogador: " + escolhaDoJogador);
        System.out.println("----------------------------------------------------------------------------------------");

        String turma = "Coding tank";
        String linguagemProgramacao = "Java";
        int quantidadeAlunos = 35;
        String diasAulas = "Seg à Sex";
        String horarioAulas = "19:00 às 22:00";


        System.out.printf("Bem vindos ao %s %s. As aulas serão de %s das %s%nA turma contém %d alunos.%n", turma,
                linguagemProgramacao, diasAulas, horarioAulas, quantidadeAlunos);
        System.out.println("----------------------------------------------------------------------------------------");

        /*
         * Operadores aritmetricos
         * + -> soma
         * - -> subtração
         * (*) -> multiplicação
         * (/) -> divisão
         * (%) -> resto da divisao
         * */

        int num = 10;
        int num1 = 5;
        int soma = num + num1;
        int subtracao = num - num1;
        int multiplicacao = num * num1;
        int divisao = num / num1;
        int restoDivisao = num % num1;
        System.out.printf("A soma de %d + %d é: %d%n", num, num1, soma);
        System.out.printf("A subtracao de %d + %d é: %d%n", num, num1, subtracao);
        System.out.printf("A multiplicacao de %d + %d é: %d%n", num, num1, multiplicacao);
        System.out.printf("A divisao de %d + %d é: %d%n", num, num1, divisao);
        System.out.printf("A restoDivisao de %d + %d é: %d%n", num, num1, restoDivisao);
        System.out.println("----------------------------------------------------------------------------------------");
        //Exercício 1 - área do círculo
        final double PI = 3.14159;
        double raio = 10;
        double area = PI * (raio * raio);
        System.out.printf("A=%.4f%n", area);
        System.out.println("----------------------------------------------------------------------------------------");

        //Exercício 2 - Salário
        String matricula = "123";
        int horasTrabalhadas = 100;
        double valorHora = 5.50;
        double salario = horasTrabalhadas * valorHora;
        System.out.printf("Matrícula = %s%nSálario = R$%.2f%n", matricula, salario);
        System.out.println("----------------------------------------------------------------------------------------");

        //Exercício 3 - Salário com bônus
        String nomeVendedor = "Jose";
        double salarioFixo = 500.00;
        double vendas = 1230.00;
        double comissao = 0.15;
        double salarioFinal = salarioFixo + (vendas * comissao);
        System.out.printf("%s irá receber o total de R$ %.2f", nomeVendedor, salarioFinal);

    }
}
