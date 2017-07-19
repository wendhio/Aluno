package ch03.Exer03_14;
 
import javax.swing.JOptionPane;

public class EmployeeTest{
    public static void main(String[] args){
        Employee e1, e2;
        e1 = new Employee();
	e2 = new Employee();	
        
        e1.entrada();
        e2.entrada();
        
        System.out.printf("Nome: %s Salário Anual: %s\n",e1.getNome(), e1.getSalario()*12);
	System.out.printf("Nome: %s Salário Anual: %s\n",e2.getNome(), e2.getSalario()*12);
		
	e1.setSalario(e1.getSalario()*1.1);
	e2.setSalario(e2.getSalario()*1.1);
		
	System.out.println("-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;");
		
	System.out.printf("Nome: %s Salário Anual: %s\n",e1.getNome(),
	e1.getSalario()*12);
	System.out.printf("Nome: %s Salário Anual: %s\n",e2.getNome(),
        e2.getSalario()*12);
      
    }
}
