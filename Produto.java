public class Produto{
    private int id;
    private String nome;
    private double preco;

    Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }
}