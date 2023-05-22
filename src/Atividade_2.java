import java.util.Random;

/*2. Escreva um algoritmo que leia a quantidade de combustível abastecido em um automóvel
em litros, bem como, a distância que o automóvel percorre por litro abastecido. O
algoritmo deverá calcular e mostrar a distância máxima que o automóvel poderá atingir. */
public class Atividade_2
{

    public static void main(String[] args)
    {
        Random random = new Random();

        int comb_abast = random.nextInt(5, 50);// usando a biblioteca Random, para me informar
                                                           //  VALOR ALEATORIO
        System.out.println(comb_abast);    // IMPRIMI A INFORMAÇÃO DA VARIAVEL (comb_abast).

        int dist_perc = random.nextInt(4,18);
        System.out.println(dist_perc);

        int dist_max = comb_abast * dist_perc;
        System.out.println(dist_max);






    }
}
