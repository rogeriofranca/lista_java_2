/*
    Elabore um algoritmo que tendo como entrada o preço e código de origem de um produto,
    calcule e mostre na tela o valor do desconto concedido. Os códigos são os seguintes:
1 – região norte com desconto de 5%;
2 – região sul com desconto de 15%;
3 – região sudeste com desconto de 7%;
4 – região nordeste com desconto de 12% e
5 – região centro-oeste com desconto de 20%.
Caso não seja informado nenhum código valido informar na tela que o produto é importado

 */

import java.util.Scanner;

public class Atividade_11 {
    public static void main(String[] args) {
        int codigo_do_regiao;
        double preco;

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o preço: " );
        preco = scanner.nextDouble();

        System.out.println("código de origem de um produto: ");
        codigo_do_regiao = scanner.nextInt();

        if (codigo_do_regiao == 1) {
            preco = preco * 0.05;
            imprimir(codigo_do_regiao, preco);
        } else if (codigo_do_regiao == 2) {
            preco = preco * 0.15;
            imprimir(codigo_do_regiao, preco);
        } else if (codigo_do_regiao == 3) {
            preco = preco * 0.07;
            imprimir(codigo_do_regiao, preco);
        } else if (codigo_do_regiao == 4) {
            preco = preco * 0.12;
            imprimir(codigo_do_regiao, preco);
        } else if (codigo_do_regiao == 5) {
            preco = preco * 0.20;
            imprimir(codigo_do_regiao, preco);
        } else {
            System.out.println("Codigo Invalido");
        }

    }
    public static void imprimir(int codigo, double preco){
        System.out.println("o codigo digitado: "+codigo+" e o valor do desconto: "+preco);
    }
}
