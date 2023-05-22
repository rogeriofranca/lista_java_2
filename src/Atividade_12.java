import java.util.Random;

public class Atividade_12 {
    public static void main(String[] args) {
        int codigo_do_pedido;
        int quantidade;
        double valor_total;

        Random random = new Random();
        codigo_do_pedido = random.nextInt(101, 107);
        quantidade = random.nextInt(1,10);

        if (codigo_do_pedido == 101) {
            valor_total = quantidade * 1.20;
            imprimir(codigo_do_pedido, quantidade,valor_total);

        } else if (codigo_do_pedido == 102) {
            valor_total = quantidade * 1.30;
            imprimir(codigo_do_pedido, quantidade,valor_total);

        } else if (codigo_do_pedido == 103) {
            valor_total = quantidade * 1.50;
            imprimir(codigo_do_pedido, quantidade,valor_total);

        } else if (codigo_do_pedido == 104) {
            valor_total = quantidade * 1.20;
            imprimir(codigo_do_pedido, quantidade,valor_total);

        } else if (codigo_do_pedido == 105) {
            valor_total = quantidade * 1.30;
            imprimir(codigo_do_pedido, quantidade,valor_total);

        } else if (codigo_do_pedido == 106) {
            valor_total = quantidade * 1.00;
            imprimir(codigo_do_pedido, quantidade,valor_total);

        } else {
            System.out.println("O numero do codigo do lanche é invalido");
        }
    }
    public static void imprimir(int codigo, int qtd, double total){
        System.out.printf("Código do pedido: "+codigo+" Quantidade: " +qtd + " Valor a pagar: R$ %.2f",total,"0");
    }
}
