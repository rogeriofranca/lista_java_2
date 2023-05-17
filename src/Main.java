import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* USO DO SCANNER: CAPTURA ENTRADAS DO TECLADO
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor");
        int x = scanner.nextInt();

        /* USO DO RANDOM: GERA VALORES ALEATORIOS
        */
        Random random = new Random();
        int y = random.nextInt(5);
        System.out.println("valor inserido pelo scanner " +x);
        System.out.println("valor inserido pelo random " +y);
    }
}