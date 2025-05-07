package SistemaPizzaria;

public class ClassePizza {
    private String cliente;
    private int quantidade;
    private double preco;

    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Construtor(String cliente , int quantidade , double preco){
        this.cliente = cliente ; 
        this.quantidade = quantidade ;
        this.preco = preco; 
    }

    public String toString(){
        return "Nome do Cliente  "  + cliente + " Quantidade de pizzas: " + quantidade + " Preço:  " + preco ;
    }
}
