import java.io.IOException;
import java.util.Scanner;

/*  Escreva um algoritmo que leia um valor para a variável A e um valor para a variável B.
    Logo apos, o algoritmo deverá fazer com que a variável A guarde o valor da variável B e a
    variável B guarde o valor da variável A. Apresentar os valores das variáveis A e B antes e
    depois da troca.*/
    public class Atividade_4 {
    public static void main(String[] args) throws IOException {

    int var_a;
    int var_b;
    int aux;

    System.out.println("var_a ");

    Scanner lera = new Scanner(System.in);
    var_a = lera.nextInt();

    System.out.print("var_b ");
    var_b = lera.nextInt();

    System.out.println("O valor de a é: " +var_a);
    System.out.println("O valor de b é: " +var_b);

    aux = var_a;
    var_a = var_b;
    var_b = aux;

        System.out.println("O novo valor de a é: " +var_a);
        System.out.println("O novo valor de b é: " +var_b);






    }
}
