package Exercícios;
/*Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double quantidadeMin  = 0.0;
        double quantidadeMax = 0.0;
        double estoqueMedio = 0.0;


        System.out.println("Qual é o valor mínimo?");
        quantidadeMin = entrada.nextDouble();

        System.out.println("Qual é o valor máximo?");
        quantidadeMax = entrada.nextDouble();

        estoqueMedio = (quantidadeMin + quantidadeMax)/2;

        System.out.println("O estoque médio é: " + estoqueMedio);





    }
}
