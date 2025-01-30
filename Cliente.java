import java.util.ArrayList;
public class Cliente{
    private int id;
    private String nome;
    private String endereco;
    private ArrayList<Pedido> historico_pedidos;

    Cliente(int id, String nome, String endereco){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;

        historico_pedidos = new ArrayList<Pedido>();
        System.out.println("Adicionado: "+id+") "+nome+" - Endereço: "+endereco);
    }

    public void adicionar_pedido(Pedido pedido){
        this.historico_pedidos.add(pedido);
    }
}
