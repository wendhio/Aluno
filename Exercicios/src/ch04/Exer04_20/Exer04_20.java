/*
 * Desenvolva um aplicativo Java que determine o salário bruto de cada um dos três empregados.
 * A empresa paga 'hora normal' pelas primeiras 40 horas trabalhadas por cada funcionário
 * e 50% a mais para todas as horas trabalhadas além de 40 horas. Você recebe uma lista dos
 * empregados da empresa, o número de horas trabalhadas por empregado na última semana e o
 * salário-hora de cada empregado. Seu programa deve aceitar a entrada dessas informações para
 * cada empregado e então determinar e exibir o salário bruto do empregado. Utilize a classe
 * Scanner para inserir os dados.
 */
package ch04.Exer04_20;

import java.util.Scanner;

public class Exer04_20{
    public static void main(String[] args){
	
        Scanner scan = new Scanner( System.in);
        double[] empregado = new double[3];
        double[] salario = new double[3];
        int[] horas = new int[3];
        
        for( int i = 0; i < 3; i++){
            System.out.println("Empregado " +(i+1));
            System.out.println("Horas trabalhadas?");
            horas[i] = scan.nextInt();
            System.out.println("Sálario-Hora?");
            salario[i] = scan.nextDouble();
        }
        
        for( int i = 0; i < 3; i++){
            if( horas[i] <= 40){
                empregado[i] = salario[i]*horas[i]; 
            }else{
                empregado[i] = salario[i]*40;
                empregado[i] += (horas[i]-40)*(1.5*salario[i]);
                System.out.println("hora extra");
            }
        }
        
        for( int i = 0; i < 3; i++){
            System.out.println("Empregado "+(1+i));
            System.out.println("Salário-hora: " + salario[i]);
            System.out.println("Horas trabalhadas: " + horas[i]);
            System.out.println("Salário Final: " + empregado[i]);
        }
        
        
        
        
        
        
    }
}