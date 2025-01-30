public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
    }

    public static void testar(){
        //Teste 1
        Cliente clienteSergio = new Cliente(0,"Sérgio Correia","Rua Marcelo Vieira");
        Pedido pedido1 = new Pedido(0,clienteSergio);

        //Teste 2
        Produto produtoArroz = new Produto(0,"Arroz",20.40);
        pedido1.adicionar_produto(produtoArroz, 2);

        //Teste 3
        System.out.println("O total é de : "+pedido1.calcular_total()+" R$");
        
        //Teste 4
        Pagamento pagamentoPedido1 = new Pagamento("Pix",pedido1);
        pagamentoPedido1.aprovar_pedido();

        //Teste 5
        pagamentoPedido1.recusar_pedido();

        //Teste 6
        Entrega entregaPedido1 = new Entrega(pedido1);
        entregaPedido1.iniciar_entrega();
        entregaPedido1.finalizar_entrega();
    }
}





