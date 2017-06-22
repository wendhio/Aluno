/*
 * Modifique a classe Account (Figura 3.13) para fornecer um método chamado debit que retira
 * denheiro de um Account. Assegure que a quantia de débito não exceda o saldo de Account. Se
 * exceder, o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que
 * indica "Debit amount exceed account balance" [Quantia de débito excedeu o saldo da conta].
 * Modifique a classe AccountTest (Figura 3.14) para testar o método debit.
 */

package ch03.Exer03_12;

public class Account{
    private double balance; // variável de instância que armazena o saldo.
    
    public Account( double initialBalance ){
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    
    public void debit( double debito ){
        if ( balance - debito >= 0.0)
            balance -= debito;
        else
            System.out.println("Quantia de débito excedeu o saldo da conta");
    }
    
    public void credit( double amount ){
        balance += amount;
    }
    
    public double getBalance(){
        return balance;
    }
}
