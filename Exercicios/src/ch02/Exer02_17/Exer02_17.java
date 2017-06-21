/*
 * Escreva um aplicativo que insere três inteiros digitados pelo usuário e exibe
 * a soma, a média, o produto e os números menores e maiores. Utilize as
 * técnicas mostradas na Figura 2.15. [Nota: O cálculo da média nesse exercício
 * deve resultar em uma representação de inteiro da média. Assim, se a soma dos
 * valores for 7, a média deverá ser 2 e não 2,3333...]
 */

package ch02.Exer02_17;

import java.util.Scanner;

public class Exer02_17
{
    public static void main(String[] args)
    {
        int n1, n2, n3, soma, produto;
        double media = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o 1 número: ");
        n1 = input.nextInt();

        System.out.println("Digite o 2 número: ");
        n2 = input.nextInt();
        
        System.out.println("Digite o 3 número: ");
        n3 = input.nextInt();
        
        soma = n1+n2+n3;
        produto = n1*n2*n3;
        media = soma/3;
        
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Produto: " + produto);

        System.out.println("Comparações: ");
        if (n1 > n2) {
            System.out.println("n1 é maior que n2.");
        } else if (n1 < n2) {
            System.out.println("n1 é menor que n2.");
        } else {
            System.out.println("n1 é igual a n2.");
        }

        if (n1 > n3) {
            System.out.println("n1 é maior que n3.");
        } else if (n1 < n3) {
            System.out.println("n1 é menor que n3.");
        } else {
            System.out.println("n1 é igual a n3.");
        }

        if (n2 > n3) {
            System.out.println("n2 é maior que n3.");
        } else if (n2 < n3) {
            System.out.println("n2 é menor que n3.");
        } else {
            System.out.println("n2 é igual a n3.");
        }

    }
}