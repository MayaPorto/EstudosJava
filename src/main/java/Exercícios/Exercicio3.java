package Exercícios;

import java.util.Scanner;

/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

public class Exercicio3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        double cotaçãoDoDolar = 0.0;
        double valorEmdolar = 0.0;


        System.out.println("Qual é a cotação do dólar atualmente?" );
        cotaçãoDoDolar = entrada.nextDouble();

        System.out.println("Qual é o valor do dólar atualmente?" );
        valorEmdolar = entrada.nextDouble();

        double valorReal = cotaçãoDoDolar * valorEmdolar;
        System.out.println("O valor em real é: " + valorReal);

    }
}
