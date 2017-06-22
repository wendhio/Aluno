/*
 * Escreva um aplicativo que lê dois inteiros, determina se o primeiro é
 * múltiplo do segundo e imprime o resultado. [Dica: Utilize o operador de
 * módulo.]
 */

package ch02.Exer02_26;

import java.util.Scanner;

public class Exer02_26
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Digite o primeiro número");
        n1 = input.nextInt();
        
        System.out.println("Digite o segundo número");
        n2 = input.nextInt();
        
        if (n1 % n2 == 0)
            System.out.println("Sim!");
        else
            System.out.println("Não!");
    }
}
