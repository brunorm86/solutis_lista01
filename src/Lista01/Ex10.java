package Lista01;

/*
10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        String[] vogais = {"a", "á", "ã", "à", "e", "ê", "é", "i", "o", "ó", "õ", "u", "ú"};

        String[] consoantes = {"b", "c", "ç", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        String[] caracteresEspeciais = {"!", ",", ".", "-", "_", "?", "#", "$", "@", "&", "*", "(", ")"};

        int qntVogais = 0;

        int qntConsoantes = 0;

        int qntEspacos = 0;

        int qntCaracteresEspeciais = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma cadeia qualquer de caracteres: ");

        String cadeiaCaracteres = sc.nextLine();

        String[] cadeiaSeparada = cadeiaCaracteres.toLowerCase().split("");

        System.out.println(Arrays.toString(cadeiaSeparada));

        for (String s : cadeiaSeparada) {
            if (Arrays.asList(vogais).contains(s)) {
                qntVogais++;
            } else if (Arrays.asList(consoantes).contains(s)) {
                qntConsoantes++;
            } else if (Arrays.asList(caracteresEspeciais).contains(s)) {
                qntCaracteresEspeciais++;
            } else if (s.equals(" ")) {
                qntEspacos++;
            }
        }
            System.out.println("Frase: "+cadeiaCaracteres);
            System.out.println("Quantidade de vogais: "+qntVogais);
            System.out.println("Quantidade de consoantes: "+qntConsoantes);
            System.out.println("Quantidade de caracteres especiais: "+qntCaracteresEspeciais);
            System.out.println("Quantidade de espaços: "+qntEspacos);

    }
}
