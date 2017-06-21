/*
 * 	Utilizando as instruções que você escreveu no Exercício 2.5, escreva um
 * programa completo que calcule e imprima o produto de três inteiros.
 */

package ch02.Exer02_06;

import java.util.Scanner;

public class Product
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int x, y, z, result;
        
        System.out.println("Digite o 1 número: ");
        x =  input.nextInt();
        
        System.out.println("Digite o 2 número: ");
        y =  input.nextInt();
        
        System.out.println("Digite o 3 número: ");
        z = input.nextInt();
        
        result = x + y + z;
        
        System.out.println("Product is: " + result);
    }
}