import java.util.ArrayList;

public class Pedido{
    private int id;
    private Cliente cliente;
    private ArrayList<Produto> itens;
    private String status; 
    private float valor_total;

    Pedido(int id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        cliente.adicionar_pedido(this);
        this.status = "Aguardando Pagamento";

        itens = new ArrayList<Produto>();
    }

    public void adicionar_produto(Produto produto, int quantidade){
        for(int i = 0;i<quantidade;i++){
            this.itens.add(produto);
            this.valor_total += produto.getPreco();

        }
        System.out.println("Adicionado(s) "+quantidade+"x "+produto.getNome());
    }

    
    public float calcular_total(){
        return valor_total;
    }

    /**
     * Muda o status do pedido
     * @param status "Aguardando Pagamento", "Pago", "Enviado" ou "Entregue"
     */
    public void setStatus(String status){
        this.status = status;
    }


}