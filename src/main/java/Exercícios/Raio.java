package Exercícios;
/**
 * Crie uma classe Circulo que possui:
 *  * 	* Atributos: raio, cor.
 * 	* Construtores:
 * 		- Cria circulos com base no parâmetro raio do construtor;
 * 		- Cria círculos de raio 1;
 * 	* Métodos:
 * 		//- calcularArea() => deve retornar double (PI * RAIO * RAIO)
 * 		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
 * 		- mudarRaio(double novoRaio) => deve alterar o valor do raio
 */

/**
 * Crie uma classe Circulo que possui:
 *  *  * 	* Atributos: raio, cor.
 */

    public class Raio {
        private  double raio;
         String cor;
         double PI;
/**Cria circulos com base no parâmetro raio do construtor;*/
    Raio (double raio) {
            this.raio = raio;

    };
/**Cria círculos de raio 1*/
    Raio (double raio, String cor, double PI) {
        this.raio = 1;
        this.cor = cor;
        this.PI = 3.14;
    };
/**calcularArea() => deve retornar double (PI * RAIO * RAIO)*/
    double calcularArea( double raio){
        double PI = 3.14;
         return (PI * raio * raio);
    };
/**calcularCircunferencia => deve retornar double (2 * PI * RAIO)*/
    double calcularCircunferencia(){
        double circunferencia = (2 * this.PI * this.raio);
        return circunferencia;
    };

};
