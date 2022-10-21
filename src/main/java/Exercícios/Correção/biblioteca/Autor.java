package Exercícios.Correção.biblioteca;
/* Crie uma classe Autor que possui:
    Atributos: nome, email;
    Construtores:
        - Cria autores com base nos parâmetros nome e email;
    Métodos:
        - alteraNome(String novoNome) => muda o nome atual do autor
        - alteraEmail(String novoEmail) => muda o email atual do autor*/
public class Autor {
    private String nome;
    private String email;

    public Autor(String nome , String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }
    public String setNome(String nome){
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
    public String setEmail(String email){
        return this.email;
    }
}
