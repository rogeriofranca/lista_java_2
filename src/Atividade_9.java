import java.util.Scanner;

/* 9. Em uma competição o nadador é premiado de acordo com a distância máxima que percorrer.
Se o nadador percorrer uma distância menor que 800 metros, recebe R$ 5.000,00 reais de
prêmio. Caso percorra uma distância entre 800 e 1500 metros, recebe R$ 10.000,00. E se
percorrer uma distância superior a 1500 metros, recebe R$ 15.000,00 em prêmio. Escreva
um algoritmo que leia a distância percorrida e mostre na tela o valor da premiação a ser
recebida pelo nadador.

 */
public class Atividade_9 {
    public static void main(String[] args) {
        int distancia_percorrida = 0;
        double premio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a distancia percorrida: ");
        distancia_percorrida = scanner.nextInt();

        if (distancia_percorrida < 800) {
            premio = 5000.0;
            System.out.println("Valor do Premio: R$" + premio);

        } else if (distancia_percorrida >= 800 && distancia_percorrida <= 1500) {
            premio = 10000.0;
            System.out.println("Valor do Premio: R$" + premio);

        } else if (distancia_percorrida > 1500) {
            premio = 15000.0;
            System.out.println("Valor do Premio: R$" + premio);

        }


    }


}

