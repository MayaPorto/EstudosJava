package Aulas.Poo;

public class Pet {
    private  String nome;
    private int idade;
    protected double peso;//só acessível dentro da classe pet(get e set)// as subclasses não tem acesso por estar private
//daí tem que usar set para mudar o peso, e consegue acessar o get peso
 //qnd é protect permite acesso diteto das subclasses
    //private = celular privado (só voce tem acesso) protected = telefone fixo (voce e sua familia tem acesso)
    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    //Ação: faz algum som
    public void fazerSom() {
        System.out.println("----");
    }
    //Ação comer
    public void comer(String comida){
        System.out.println("Estou comento" + comida);
    }
    //Ação dormir
    public void dormir(){
        System.out.println("zzzzzzzz");
    }
    public void brincar() {
        System.out.println("Estou brincando...");
    }
    //controlar a leitura e escrita
    public double getPeso() {//consegue ler o valor mas não muda
        return this.peso;
    }
    //set - alterar o valor do peso, sempre tem parâmetro, pq tá private
    public void setPeso(double novopeso) {//o valor do novo peso vai no ()

    }
}
