/*
 * Escreva um aplicativo que solicita ao usuário inserir dois inteiros, obtém do
 * usuário esses números e imprime sua soma, produto, diferença e quociente
 * (divisão). Utilize as técnicas mostradas na Figura 2.7.
 */

package ch02.Exer02_15;

import java.util.Scanner;

public class Exer02_15
{
	public static void main(String[] args)
	{
            int n1, n2, soma, dif, div, product;
            
            Scanner input = new Scanner( System.in );
            
            System.out.println("Digite o 1 numero: ");
            n1 = input.nextInt();
            
            System.out.println("Digite o 1 numero: ");
            n2 = input.nextInt();
            
            soma = n1+n2;
            dif = n1-n2;
            product = n1*n2;
            div = n1/n2;
            
            System.out.printf("Soma: %d\nDiferenca: %d\nProduto: %d\n Divisão: %d\n",
                    soma, dif, product, div);
            
            
            
	}
}
