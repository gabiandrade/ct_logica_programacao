package aula_4;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        boolean jogoAtivo = true;
        char jogadorAtual = 'X';

        Scanner scanner = new Scanner(System.in);

        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            System.out.println("É a vez do jogador " + jogadorAtual + ". Digite a posição (linha coluna): ");

            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;

                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogadorAtual + " venceu o jogo!");
                    jogoAtivo = false;
                } else if (verificarEmpate(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("O jogo terminou em empate!");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            if(i != 2){
                System.out.println("\n--------------");
            }
        }
        System.out.println();
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }

        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
