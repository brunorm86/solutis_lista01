package Lista01;

/*
8. Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da direita
 pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.
 */

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer para verificar se ela é um palíndromo: ");

        String palavra = sc.nextLine();

        if (isPalindromo(palavra)) {
            System.out.println("'"+palavra + "' é um palíndromo.");
        } else {
            System.out.println("'"+palavra + "' não é um palíndromo.");
        }

    }

    public static boolean isPalindromo(String palavra){

        String palavraInvertida = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        return palavra.equalsIgnoreCase(palavraInvertida);

    }
}