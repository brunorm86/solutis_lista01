package Lista01;

/*
9. Escreva uma classe para calcular a área de um círculo, sabendo que a área é
A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá que ser arredondado.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        double areaCirculo = 0;

        double raio = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");

        try{
            raio = sc.nextDouble();

            areaCirculo = Math.PI*Math.pow(raio, 2);

            System.out.print("A área do círculo de raio "+raio+" é ");

            System.out.printf("%.2f%n", areaCirculo);

        } catch (InputMismatchException e){
            System.out.println("Valor inválido");
        }
    }
}