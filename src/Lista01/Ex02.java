package Lista01;

/*
2. Faça um programa que receba 2 valores e retorne o maior entre eles.
 */

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        double a = scan.nextDouble();

        System.out.println("Digite o valor B: ");
        double b = scan.nextDouble();

        if(a>b){
            System.out.println("A ("+a+") é maior do que B ("+b+")");
        } else if(a<b){
            System.out.println("A ("+a+") é menor do que B ("+b+")");
        } else{
            System.out.println("A ("+a+") e B ("+b+") são iguais");
        }

    }
}
