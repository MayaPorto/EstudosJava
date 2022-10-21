package Exercícios.Correção.pow;
/**Crie uma classe Comida:
 * Atributos: nome, peso;
 * Cosntrutores: cria a comida com base nos parametros nome e peso;
 * Métodos:
 * -getNome()
 * -getPeso()*/
public class Comida {
    private String nome;
    private double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}