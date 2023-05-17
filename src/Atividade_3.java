

/*  O valor unitário de um livro na promoção custa R$ 12,00, caso o cliente comprar até dez livros.
    Caso compre acima de 10, o preço unitário do livro custa R$ 8,00.
    Escreva um algoritmo que leia o número de livros comprados, calcule e mostre o valor total que o cliente deverá
    pagar.*/

import java.util.Random;

public class Atividade_3
{

    public static void main(String[] args)
    {
        Random random = new Random();
        int numero_livro = random.nextInt(9,12);
        double valor_total;
        if (numero_livro <= 10) {
            valor_total = numero_livro * 12.0;
        }else{
            valor_total = numero_livro * 8.0;
        }
        System.out.println(numero_livro +"-"+ valor_total);


//        switch (numero_livro){
//            case 9:
//                valor_total = numero_livro * 12.0;
//                System.out.println(numero_livro +"-"+valor_total);
//                break;
//            case 10:
//                valor_total = numero_livro * 12.0;
//                System.out.println(numero_livro +"-"+valor_total);
//                 break;
//            case 11:
//                valor_total = numero_livro * 8.0;
//                System.out.println(numero_livro +"-"+valor_total);
//                break;
//
//            default:
//                System.out.println("numero invalido");
//
//
//
//
//    }

    }


}
