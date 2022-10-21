package Exercícios.Correção.biblioteca;
/* Crie uma classe Livro que possui:
    Atributos: nome, autor, preco;
    Construtores:
        - Cria livros com base nos parâmetros nome, autor (objeto da classe Autor), preco;*/
public class Livro {
    private String nome;
    private Autor autor;//informações do autor, ñ é herança é um obj dentro de obj
    private double preco;

    public Livro(String nome, Autor autor, double preco, int i) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main(String[] args) {
        Autor jk = new Autor( "JK" , "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra", jk, 24,9);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());
    }


}
