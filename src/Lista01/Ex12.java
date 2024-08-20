package Lista01;

/*
12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida
e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um
aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina
consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir
 o consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada
  e a soma total de litros de combustível consumidos até esse ponto. Todos os cálculos de média
   devem produzir resultados de ponto flutuante.
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quilometrosPercorridosTotal = 0;
        int litrosConsumidosTotal =0;
        float mediaConsumo;
        int totalTanques = 0;

        do{
            System.out.print("Digite a quantidade de Quilometros percorridos (Ou '0' para sair): ");
            int quilometros = sc.nextInt();
            if(quilometros == 0) {
                break;
            }
            System.out.println("Digite a quantidade de litros no tanque (Ou '0' para sair: )");
            int litros = sc.nextInt();
            if(litros == 0){
                break;
             }

            totalTanques++;

            quilometrosPercorridosTotal += quilometros;

            litrosConsumidosTotal += litros;

            mediaConsumo = (float)quilometros / litros;

            System.out.println("Com este tanque de "+litros+"l, o " +
                    "carro percorreu "+quilometros+"km fazendo uma média de " +
                    "consumo de "+mediaConsumo+"km/L");
            System.out.println("Quilometragem total contabilizada: "+quilometrosPercorridosTotal+"km" +
                    "\nDistância total contabilizada: "+litrosConsumidosTotal+"L" +
                    "\nTotal de tanques: "+totalTanques);

        }while(true);
    }
}
