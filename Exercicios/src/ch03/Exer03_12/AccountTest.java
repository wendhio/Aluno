package ch03.Exer03_12;

import java.util.Scanner;

public class AccountTest 
{
    public static void main(String[] args){
        Account conta1 = new Account( 50.00 );
        Account conta2 = new Account( -10.00 );
        
        System.out.printf("Saldo conta1 = $%.2f\n", conta1.getBalance());
        System.out.printf("Saldo conta2 = $%.2f\n", conta2.getBalance());
        
        Scanner input = new Scanner( System.in );
        double depositAmount, saque;
    
        System.out.println("Valor de deposito conta1: ");
        depositAmount = input.nextDouble();
        System.out.printf("Valor depositado = %.2f\n", depositAmount);
        conta1.credit(depositAmount); 
     
        System.out.printf("Saldo conta1 = $%.2f\n", conta1.getBalance());
        System.out.printf("Saldo conta2 = $%.2f\n", conta2.getBalance());
        
        System.out.println("Valor de deposito conta2: ");
        depositAmount = input.nextDouble();
        System.out.printf("Valor depositado = %.2f\n", depositAmount);
        conta2.credit(depositAmount);
        
        System.out.printf("Saldo conta1 = $%.2f\n", conta1.getBalance());
        System.out.printf("Saldo conta2 = $%.2f\n", conta2.getBalance());
        
        System.out.println("Digite o valor do saque: ");
        saque = input.nextDouble();
        System.out.printf("Valor sacado = %.2f\n", saque);
        conta1.debit(saque);
        
    }
}
