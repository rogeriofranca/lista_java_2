/*
10. Escreva um algoritmo que leia a cidadania de uma pessoa, codificada da seguinte forma:
1 – Brasileiro;
2 – Alemão;
3 – Inglês;
4 – Italiano;
5 – Espanhol e
6 – Frances.
    O algoritmo devera mostrar na tela a língua nativa do cidadão, de acordo com a cidadania
    selecionada. Caso não seja informado nenhum código válido, informar na tela que a língua
    nativa da pessoa não pode ser verificada.
 */

import java.util.Random;

public class Atividade_10{
    public static void main(String[] args){
        //Primeiro Passo - Criar Variaveis (analizar o problema para identificar o tipo de variavel).
      int numero_digitado;

       //Segundo Passo - Popular a Variavel (Bibliotecas: Scanner ou Random)
        Random random = new Random();
        numero_digitado = random.nextInt(10);//Está recebendo a cidadania (escolhe um numero aleatório)

       //Terceiro Passo - Logica do Programa se inicia (O coração do problema)

       if (numero_digitado == 1){
           System.out.println("Cidadania: "+numero_digitado+" A Lingua Nativa é o Portugues ");
       }else if(numero_digitado == 2){
           System.out.println("Cidadania: "+numero_digitado+" A Lingua Nativa é o Alemão ");
       }else if (numero_digitado == 3){
           System.out.println("Cidadania: "+numero_digitado+" A Lingua Nativa é o Inglés ");
       }else if (numero_digitado == 4){
           System.out.println("Cidadania: "+numero_digitado+" A Lingua Nativa é o Italiano ");
       }else if (numero_digitado == 5){
           System.out.println("Cidadania: "+numero_digitado+" A Lingua Nativa é o Espanhol ");
       }else if (numero_digitado == 6){
           System.out.println("Cidadania: "+numero_digitado+" A Lingua Nativa é o Françes ");
       }else{
           System.out.println("Cidadania: "+numero_digitado+" pessoa não pode ser verificada.");
       }


    }
}
