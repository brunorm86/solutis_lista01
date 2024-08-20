package Lista01;

/*
11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética
 (utilize o método compareTo da classe String). Informe também, qual das palavras tem o maior número de caracteres.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        //feito um algoritmo genérico para qualquer quantidade de palavras fornecidas
        final int QUANTIDADE_PALAVRAS = 5;

        String maiorPalavra = "";

        ArrayList<String> palavras = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < QUANTIDADE_PALAVRAS; i++) {

            System.out.println("Digite a " + (i + 1) + "ª palavra: ");
            palavras.add(entrada.nextLine());

        }

        //Imprime números digitados na ordem fornecida
        System.out.println("As palavras digitadas, na ordem fornecida, foram: ");
        System.out.println(palavras);


        //Imprime números digitados na ordem crescente
        palavras.sort(String::compareToIgnoreCase);
        System.out.println("As palavras em ordem alfabética são: ");
        System.out.println(palavras);

        //Verifica qual é a maior das palavras
        for(String palavra : palavras) {
            if(palavra.length()>maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }
        System.out.println("A maior dessas palavras é '"+maiorPalavra+"'");
    }

    /*
    public static void comparaPalavras(ArrayList<String> palavras) {

        // Entrada das duas palavras
        String palavra1 = palavras.get(0);
       String palavra2 = palavras.get(1);

       // Comparação das palavras em ordem alfabética
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais: " + palavra1);
        }

        // Verificação da palavra com maior número de caracteres
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com mais caracteres é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra com mais caracteres é: " + palavra2);
        } else {
            System.out.println("As duas palavras têm o mesmo número de caracteres.");
        }
    }

     */
}