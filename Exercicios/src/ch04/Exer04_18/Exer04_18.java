/*
 * Desenvolva um aplicativo Java que determinará se um cliente de uma loja de departamentos
 * excedeu o limite de crédito em uma conta corrente. Para cada cliente, os seguintes fatos
 * estão disponíveis:
 * 
 * a) número de conta
 * b) saldo no início do mês
 * c) total de todos os itens cobrados desse cliente no mês
 * d) total de créditos aplicados ao cliente no mês
 * e) limite de crédito autorizado
 * 
 * O programa deve inserir todos esses fatos como inteiros, calcular o novo saldo
 * (= saldo inicial + despesas - créditos), exibir o novo saldo e determinar se o novo saldo
 * excede o limite de crédito do cliente. Para aqueles cujo limite for excedido, o programa
 * deve exibir a mensagem "Limite de crédito excedido".
 */

package ch04.Exer04_18;

import java.util.Scanner;

public class Exer04_18 {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner( System.in);
        
        System.out.println("Digite o numero de sua conta:");
        int number = scan.nextInt();
        
        System.out.println("Digite o saldo no inicio do mês:");
        int saldo = scan.nextInt();
        
        System.out.println("Digite o total de todos os itens cobrados desse cliente no mês");
        int compra = scan.nextInt();
        
        System.out.println("Digite o total de credito aplicado no mês");
        int credito = scan.nextInt();
        
        System.out.println("Digite o limite de credito:");
        int limite = scan.nextInt();
        
        Conta cartao = new Conta(number, saldo, compra, credito, limite);
        
        cartao.novoSaldo();
    }
}
