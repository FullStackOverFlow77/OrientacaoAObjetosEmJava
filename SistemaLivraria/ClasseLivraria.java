package SistemaLivraria;

public class ClasseLivraria {
    private String nome; 
    private String autor; 
    private int data; 

    public ClasseLivraria(String nome, String autor, int data) {
        this.nome = nome;
        this.autor = autor;
        this.data = data;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getData() {
        return data; 
    }

    public void setData(int data) {
        this.data = data; 
    }

    // Método toString
    public String toString() {
        return "Titulo: " 
            + nome 
            + ", Autor: "
            + autor 
            + ", Ano de publicação: "
            + data;  
    }
}
