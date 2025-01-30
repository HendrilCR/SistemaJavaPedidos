import java.util.UUID;

public class Entrega{
    private Pedido pedido;
    private String status_entrega; //Pode ser "Aguardando Envio", "Em Transporte" ou "Entregue"
    private UUID codigo_rastreamento;

    Entrega(Pedido pedido){
        this.pedido = pedido;
        this.status_entrega = "Aguardando Envio";
        this.codigo_rastreamento = UUID.randomUUID();
    }

    public void iniciar_entrega(){
        this.status_entrega = "Em Transporte";
        System.out.println("A entrega iniciou.");
    }
    public void finalizar_entrega(){
        this.status_entrega = "Entregue";
        System.out.println("O pedido foi entregue com sucesso.");
    }

}