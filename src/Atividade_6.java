/*6. Em um torneio de atletismo as equipes são formadas por quatro jogadores. A equipe
        da Escola SóDaCampeão e formada pelos seguintes atletas: João, Chico, Pedro e Bola.
        Algumas restrições podem ocasionar a desclassificação da equipe, são elas:

        a) O jogador João não pode ter um número de pontos menor que a metade da soma
        dos pontos dos demais jogadores que compõem a equipe;
        b) O jogador Pedro não pode ficar com o triplo de pontos do jogador bola.
        c) O jogador chico não pode ficar com zero pontos;
        d) O jogador bola pode ficar com ate metade dos pontos do jogador Pedro ou abaixo da
        soma de pontos dos jogadores João e Chico.
        Sendo assim, elabore um algoritmo que leia a pontuação de cada um dos jogadores citados.
        Apos, verifique e mostre se a equipe foi ou não desclassificada. */

/*
    Joao =  2
    Pedro = 3
    Chico = 5
    Bola = 4
    d = b <= (p/2) || b < (j+c)

 */

import java.util.Random;

public class Atividade_6 {
    public static void main(String[] args) {
        int j, p, c, b;
        Random random = new Random();
        //j = random.nextInt(100);
        j = 8;
        p = random.nextInt(10);
        c = random.nextInt(10);
        b = random.nextInt(10);


        //O TIME COMEÇA CLASSIFICADO

        boolean classificado = true;


        if (j < (c+p+b)/2){ //PRIMEIRA VALIDAÇÃO DE DESCLASSIFICAÇÃO
            System.out.println("Time Desclassificado pelo criterio A");
           classificado = false;  //O TIME FOI DESCLASSIFICADO
        } else if ( p > b * 3 ) {
            System.out.println("Time Desclassificado pelo criterio B");
           classificado = false;
        } else if (c == 0) {
            System.out.println("Time Desclassificado pelo criterio C");
           classificado = false;
        } else if (b <= (p/2) || b < (j+c)) {
            System.out.println("Time Desclassificado pelo criterio D");
           classificado = false;
        } else {
            System.out.println("Time Classificado");
        }
        System.out.println("Joao: "+ j);
        System.out.println("Pedro: "+ p);
        System.out.println("Chico: "+ c);
        System.out.println("Bola: "+ b);
    }


    }


