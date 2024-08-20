package Lista01;

/*
7. Imprima o resultado da divisão por 2 de todos os múltiplos de
3, entre 1 e 100, usando os tipos de dados int e double.
 */

public class Ex07 {

        public static void main(String args[]) {

            for(int i = 1; i<=100; i++){
                if(i%3==0){
                    System.out.println(i + " dividido por 2 é " + ((double)i/2));
                }
            }
        }
    }

