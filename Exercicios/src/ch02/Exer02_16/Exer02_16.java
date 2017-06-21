/*
 * Escreva um aplicativo que solicita ao usuário inserir dois inteiros, obtém do
 * usuário esses números e exibe o número maior seguido pelas palavras
 * "is larger". Se os números forem iguais, imprima a mensagem "These numbers
 * are equal". Utilize as técnicas mostrada na figura 2.15.
 */

package ch02.Exer02_16;

import java.util.Scanner;

public class Exer02_16
{
	public static void main(String[] args)
	{
            int number1, number2;
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("Digite o 1 número: ");
            number1 = input.nextInt();
            
            System.out.println("Digite o 2 número: ");
            number2 = input.nextInt();
            
            if ( number1 == number2 )
                System.out.println("São iguais!");
            else if ( number1 > number2)
                System.out.println("Número 1 é o maior!");
            else
                System.out.println("Número 2 é o maior!");
	}
}
