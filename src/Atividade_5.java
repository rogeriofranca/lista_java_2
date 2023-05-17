
/*  CALCULADORA: escreva um algoritmo para ler 2 valores e uma das seguintes operações
    a serem executadas (codificada da seguinte forma: (1.Adição, 2.Subtração, 3.Divisão,
    Multiplicação). Calcular e escrever o resultado dessa operação sobre os dois valores lidos.
*/

import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Digite o primeiro número:");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo número:");
        num2 = input.nextDouble();
        System.out.println("Digite a operação que deseja:\n1 - Adição\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
        int operation = input.nextInt();
        double result;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 / num2;
                break;
            case 4:
                result = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("O resultado da operação é " + result);
    }
}
