package Lista01;

/*
6. Imprima o produto dos números ímpares de 15 a 30, usando os tipos de dados int e float.
 */

public class Ex06 {
    public static void main(String[] args) {

        int limiteInferior =15;

        int limiteSuperior =30;

        float produtoFinal = 1;

        for(int i = limiteInferior; i <= limiteSuperior; i++){

            if(i%2==1){
                produtoFinal*=i;
            }
        }

        System.out.println(produtoFinal);
    }
}