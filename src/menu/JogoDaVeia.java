package menu;

import java.util.Scanner;

public class JogoDaVeia {
    public static void main(String[] args) {
        // Criar uma matriz vazia 3x3
        String[][] matriz = new String[3][3];

        // Ler os valores da matriz
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "] (X ou O): ");
                String valor = scanner.next();
                // Verificar se o valor digitado é válido (X ou O)
                while (!valor.equals("X") && !valor.equals("O")) {
                    System.out.println("Valor inválido. Digite X ou O.");
                    valor = scanner.next();
                }
                matriz[i][j] = valor;
            }
        }

        // Exibir os valores lidos
        System.out.println("Valores lidos:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Verificar se houve um ganhador
        String ganhador = verificarGanhador(matriz);
        if (ganhador.equals("X") || ganhador.equals("O")) {
            System.out.println("O ganhador é o " + ganhador + "!");
        } else {
            System.out.println("Deu velha!");
        }
    }

    public static String verificarGanhador(String[][] matriz) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0].equals(matriz[i][1]) && matriz[i][0].equals(matriz[i][2])) {
                return matriz[i][0];
            }
        }

        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (matriz[0][j].equals(matriz[1][j]) && matriz[0][j].equals(matriz[2][j])) {
                return matriz[0][j];
            }
        }

        // Verificar diagonal principal
        if (matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2])) {
            return matriz[0][0];
        }

        // Verificar diagonal secundária
        if (matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0])) {
            return matriz[0][2];
        }

        // Não houve ganhador
        return "";
    }
}
