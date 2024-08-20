package Lista01;

/*
4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
a converte para quilômetros e apresenta o resultado no console.
(fórmula de conversão: 1 milha = 1,609km).
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de milhas: ");
        double milhas = sc.nextDouble();

        double kms = converteMilhaParaKm(milhas);

        System.out.println(milhas+" milhas equivalem a "+kms+"km");
    }

    public static double converteMilhaParaKm(double milha){
        return milha*1.609;
    }
}