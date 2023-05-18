import java.util.Scanner;

/*
8. Escreva um algoritmo que receba o nome, idade, sexo e salário fixo de um funcionário.
    Calcule e mostre o nome e salário líquido do funcionário de acordo com a tabela:
    SEXO IDADE ABONO
    M ≥ 30 100,00
    F < 30 50,00
    F ≥ 30 200,00
    M < 30 80,00
 */
public class Atividade_8 {
    public static void main(String[] args){
        int idade;
        String nome, sexo;
        double salario, salario_liquido;
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o nome: ");
        nome = scanner.next();
        System.out.println("informe a idade: ");
        idade = scanner.nextInt();
        System.out.println("informe o sexo: ");
        sexo = scanner.next();
        System.out.println("informe o salario: ");
        salario = scanner.nextDouble();

        if (sexo == "m" && idade >= 30){
            salario_liquido = salario + 100;
            System.out.println(salario_liquido);
        }
        else if (sexo == "m" && idade < 30){
            salario_liquido = salario + 80;
            System.out.println(salario_liquido);
        }
        else if (sexo == "f" && idade >= 30){
            salario_liquido = salario + 200;
            System.out.println(salario_liquido);
        }
        else if (sexo == "f" && idade < 30){
            salario_liquido = salario + 50;
            System.out.println(salario_liquido);}
        else{
            System.out.println("Nao teve direito ao abono");
        }
        }
    }
