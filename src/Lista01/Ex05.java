package Lista01;

/*
Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o
 dia da semana correspondente. Suponha que Segunda corresponde a 1 , Terça corresponde
 a 2, e assim por diante. Utilize Array.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
                "Sexta-feira", "Sábado", "Domingo"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int dias = sc.nextInt();

        while(dias > 7 || dias < 1){
            System.out.println("O número deve ser entre 1 e 7: ");
            System.out.println("Digite um número de 1 a 7: ");
            dias = sc.nextInt();
        }

        System.out.println("Tenha um(a) ótimo(a) "+diasSemana[dias-1]+"!");
    }
}
