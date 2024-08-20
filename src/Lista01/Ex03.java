package Lista01;

/*
3. Crie uma classe e na função main() implemente um programa que lê um número inteiro do teclado
 e imprime todos os números primos menores do que ele (divisíveis por 1 ou por ele mesmo).
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        int n = 0;

        ArrayList<Integer> listaPrimos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

             try {
                System.out.println("Digite um número inteiro maior do que '2' para calcular os primos inferiores a ele: ");
                n = sc.nextInt();
            }catch (InputMismatchException e ) {
                System.out.println("Valor inválido");
            }

             if(n<3){
                 System.out.println("Números menores do que '3' não possuem primos inferiores a ele!");
             } else {

                 for (int i = 2; i < n; i++) {

                     if(calculaPrimos(i)){
                         listaPrimos.add(i);
                     }
                 }
             }
        System.out.print("Números primos inferiores a "+n+": "+listaPrimos);
        }
        public static boolean calculaPrimos(int n){

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
