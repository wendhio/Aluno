/*
 * Escreva um aplicativo que insere um número consistindo em cinco dígitos do
 * usuário, separe o número em seus dígitos individuais e imprima os dígitos
 * separados uns dos outros por três espaços cada. Por exemplo, se o usuário
 * digitar 42339, o programa deve imprimir 4   2   3   3   9
 */

package ch02.Exer02_30;

import java.util.Scanner;

public class Exer02_30
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.println("Digite o número 5 digitos: ");
        number = input.nextInt();
        
        System.out.print((number / 10000) % 10 + "   ");
        System.out.print((number / 1000) % 10 + "   ");
        System.out.print((number / 100) % 10 + "   ");
        System.out.print((number / 10) % 10 + "   ");
        System.out.print(number % 10 + "   ");
        
        System.out.println();
          
        System.out.print(number % 10 + "   ");
        System.out.print((number / 10) % 10 + "   ");
        System.out.print((number / 100) % 10 + "   ");
        System.out.print((number / 1000) % 10 + "   ");
        System.out.print((number / 10000) % 10 + "   ");
        
        
    }
}
