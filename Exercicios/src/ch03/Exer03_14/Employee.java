/*
 * Crie uma classe chamada Employee que inclui três partes de informações como variáveis de
 * instância - um primeiro nome (tipo String), um sobrenome (tipo String) e um salário
 * mensal (double). Sua classe deve ter um construtor que inicializa as três variáveis de
 * instância. Forneça um EmployeeTest que demonstra as capacidades da classe Employee. Crie
 * dois objetos Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um
 * aumento de 10% e exiba novamente o salário anual de cada Employee.
 */

package ch03.Exer03_14;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Employee
{
    private String nome, sobrenome;
    private double salario;
    
    public void Employee( String nome, String sobrenome, double salario){
        setNome(nome);
        setSobrenome(sobrenome);
        setSalario(salario);
    }
    
    public void setNome( String nome){
        this.nome = nome;
    }
    
    public String getNome(){ return nome;}
    
    public void setSobrenome( String sobrenome ){
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome(){ return sobrenome;}
    
    public void setSalario( double salario){
        if ( salario < 0)
            this.salario = 0.0;
        else
            this.salario = salario;
    }
    
    public double getSalario(){ return salario; }
    
    public void entrada(){
        Scanner scan = new Scanner( System.in );
        
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        this.nome = nome;
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Quanto recebe?")); 
        this.salario = salario;
        
        
    }

}
