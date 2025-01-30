public class Pagamento{
    private Pedido pedido;
    private String metodo;

    /**
     * "Aguardando", "Aprovado", "Recusado"
     */
    private String status_pagamento;

    /**
     * @param metodo "Boleto", "Cartão" ou "Pix";
     */
    Pagamento(String metodo, Pedido pedido){
        this.pedido = pedido;
        this.metodo = metodo;
        this.status_pagamento = "Aguardando";
    }

    public void aprovar_pedido(){
        this.status_pagamento = "Aprovado";
        System.out.println(status_pagamento);
        this.pedido.setStatus("Pago");
    }

    public void recusar_pedido(){
        this.status_pagamento = "Recusado";
        System.out.println(status_pagamento);
        this.pedido.setStatus("Aguardando Pagamento");
    }
}