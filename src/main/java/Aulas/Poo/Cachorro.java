package Aulas.Poo;
/*//herdar as propriedades e métodos de pet*/
//fazer a classe de umj gato
public class Cachorro extends Pet {
    private String comidaFavorita;//o que é novo em relação ao pet
    private String raca;//o que é novo em relação ao pet
    //criar constructor
    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {//pegar os valores da super classe
        super(nome, idade, peso); //se colocarrex,1,25.0 todos vão ter o mesmo dado. tem que chamar a referencia da super classePet e trazer para subclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }
//Override sobescreve a super classe. Funciona para cachorro batata. Sem ele
    @Override//anotação-sobrescrever a ação de fazer som
    public void fazerSom(){
        System.out.println("Au, aaauuuu"); //ou this.fazerSom
    }

    @Override//anotação-sobrescrever a ação de fazer som
    public void brincar() {//msm assinatura da super classe
        this.fazerSom();//faz o som e chama o método original
        super.brincar();//faz essa chamada para reaproveitar o código, se chamar this.brincar seria loop infinito
        this.dormir();// chama o dormir do pet, pois não foi sobrescrito
    }

    @Override//mudar a comida, quandoquer comparar string usa equals
    public void comer(String comida){//tem parametro então lá em baixo aceita qlqr coisa
    if(comida.equals(this.comidaFavorita)){//só vai comer se a comida for igual a comida favorita
        super.comer(comida);// chama o comer do pet()
        //this.peso = this.peso + 0.2; com private não é possível fazer assim
        //this.setPeso(this.getPeso() + 0.2);
        this.peso += 0.2;
        }else{
            System.out.println("quero" + comida + "não");
        }
    }
    public void correrAtrasMoto() {//método específico do cachorro
        this.fazerSom();
        System.out.println();
    }


    //Herança
    public static void main(String[] args) {
        //invocacao do construtor da classe
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();
///Objeto
        Cachorro batata = new Cachorro("Rex", 5, 25, "Osso", "Caramelo");
        batata.dormir();//zzzzzz
        batata.fazerSom();//-----
        batata.comer("Feijão");//Estou comendo feijão
        batata.setPeso(20);//só alterou, mas retornaria se colocasse sout pq é void
        batata.brincar();
        batata.comer("Osso");
    }
}

