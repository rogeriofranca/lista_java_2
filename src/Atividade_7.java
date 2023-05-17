import java.util.Random;

/*
    Uma lancheria está com alguns problemas para atender aos pedidos dos clientes. Não vai
    ser possível atender pedidos que tenham algumas combinações do cardápio, são elas:

    a) O lanche bauru não poderá ser acompanhado da bebida guaraná.
    b) Se o cliente pedir X galinha, não poderá pedir água.
    c) Quando o cliente pedir pizza, somente poderá beber vinho ou água.

    Dessa forma, elabore um algoritmo que leia o lanche e a bebida e verifique se o pedido
    poderá ser ou não atendido. */
public class Atividade_7 {
    public static void main(String[] args) {
        Random random = new Random();//Biblioteca
        int pedido = random.nextInt(0,10);

        switch (pedido){
            case 0:
                System.out.println("Seu pedido "+pedido+" bauru_guarana não pode ser atendido ");
                break;
            case 1:
                System.out.println("Seu pedido "+pedido+" x_galinha_sem_agua não pode ser atendido ");
                break;
            case 2:
                System.out.println("Seu pedido "+pedido+" pizza_vinho não pode ser atendido ");
                break;
            case 3:
                System.out.println("Seu pedido "+pedido+" pizza_agua não pode ser atendido ");
                break;
            case 4:
                System.out.println("Seu pedido "+pedido+" x_tudo_sem_agua sera atendido aguarde ");
                break;
            case 5:
                System.out.println("Seu pedido "+pedido+" pizza_refrigerante sera atendido aguarde ");
                break;
            case 6:
                System.out.println("Seu pedido "+pedido+" pizza_suco sera atendido aguarde ");
                break;
            case 7:
                System.out.println("Seu pedido "+pedido+" fritas_sem_agua sera atendido aguarde ");
                break;
            case 8:
                System.out.println("Seu pedido "+pedido+" camarao_vinho sera atendido aguarde ");
                break;
            case 9:
                System.out.println("Seu pedido "+pedido+" pizza_cafe sera atendido aguarde ");
                break;
            case 10:
                System.out.println("Seu pedido "+pedido+" calabreza_cerveja sera atendido aguarde ");
                break;
            default:
                System.out.println("pedido invalido");
                break;


        }

    }
}
