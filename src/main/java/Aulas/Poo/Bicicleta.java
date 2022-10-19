package Aulas.Poo;

public class Bicicleta extends Object {//todos os obj da classe sempre terão exten
    private int marcha;
    private int velocidade;


    public Bicicleta(int marcha, int velocidade){//retornar a representação do obj string
        this.marcha = marcha;
        this.velocidade = velocidade;
    }
    @Override
    public String toString(){// alt+insert escolhe o que gerar
        return "BICICLETA(MARCHA=" + this.marcha + "," + this.velocidade + ")";//a representação dos objetos se tornou batata
    }
    public static void main(String[] args){
        Bicicleta bicicleta = new Bicicleta(21,0);
        System.out.println(bicicleta);
        Bicicleta bicicleta2 = new Bicicleta(15,10);
        System.out.println(bicicleta2);;
    }
}
