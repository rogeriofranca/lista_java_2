
 /*1. Elaborar um algoritmo que leia o público total de um jogo de futebol e forneça a renda
 do jogo, sabendo-se que havia 4 tipos de ingressos assim distribuídos: popular 10% do
 público a R$ 5,00, geral 50% do público a R$ 10,00, arquibancada 30% do público a R$
 20,00 e cadeiras 10% do público a R$ 30,00 */

import java.util.Random;

public class Atividade_1 {

    public static void main(String[] args) {

        Random random = new Random();
        int publico_total = random.nextInt(20000,85000);

        int popular = (publico_total * 10) / 100;
        double renda_popular = popular * 5;

        int geral = (publico_total * 50) / 100;
        double renda_geral = geral * 10;

        int arquibancada = (publico_total * 30) / 100;
        double renda_arquibancada = arquibancada * 20;

        int cadeira = (publico_total * 10) / 100;
        double renda_cadeira = cadeira * 30;

        double renda_total = renda_popular + renda_geral + renda_arquibancada + renda_cadeira;
        System.out.println("Total do público: "+ publico_total+" Renda Total: R$ "+ renda_total);


      //



    }
}
