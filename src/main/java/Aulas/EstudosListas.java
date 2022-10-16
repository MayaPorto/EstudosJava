package Aulas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EstudosListas {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>(); //entre <> não há como suportar tipos primitivos
        ArrayList<Integer> numeros = new ArrayList<>(); //numeros
        System.out.println(numeros);
        //impresso array vazio
        numeros.add(20);
        numeros.add(100);
        numeros.add(800);
        System.out.println(numeros);
        //[20, 100, 800]

        System.out.println(numeros.get(2));
        //800

        numeros.set(0, 500);
        System.out.println(numeros);
        //20 trocado por 500, 20 está na posição 0
        //[500, 100, 800]

        numeros.remove(0);
        System.out.println(numeros);
        //remover numero da posicao 0 //500
        //[100, 800]

        numeros.add(2, 20000000); //acima um dos valores foi removido, por isso array tem 1 posicao a menos
        System.out.println(numeros);
        //[100, 800, 20]

        System.out.println("----------------------------------------------------------------------------");

        for (int i=0; i< numeros.size(); i++){
            System.out.println(numeros.get(i));
            //pegue get.(i) o valor que está naquela posicao(i) do array numeros(numeros.size)
        }

        System.out.println("------------------------------------------------------------------------------");

        for (int contador: numeros){
            System.out.println(contador);
        }
    }
}