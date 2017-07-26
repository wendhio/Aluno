package wendhio1;
 
//@author: Wendhio Thalison Neres dos Santos
//@Matricula: 201600017249

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Aluno> alunos = new ArrayList<>();
   
    
    public static void main(String[] args) {
      
        boolean stop = true; // condição de parada.
        
        do{
            Scanner input = new Scanner (System.in);
            
            System.out.println("\t\t MENU \t\t");
            System.out.println("Escolha um número abaixo:");
            System.out.println("0 - Sair\n1 - Instanciar\n2 - Criar\n3 - Imprimir\n"
                                +"4 - Alterar\n5 - Excluir");
            
            int opcao, tam = 0; 
            opcao = input.nextInt();
            switch(opcao){
                case 0: stop = false;
                    break;
                case 1:  instanciar();
                    break;
                case 2: matriz();
                    
                    break;
                case 3: imprimir();
                    break;
                case 4: alterar();
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Entrada Inválida\t Digite novamente");
                       
            }
        }while(stop);
    }
     
    public static void instanciar(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("matricula:");
        String mat = input.nextLine();
        System.out.println("nome:");
        String nome = input.nextLine();
        System.out.println("curso");
        String curso = input.nextLine();
        Aluno x = new Aluno(mat, nome, curso);
        alunos.add(x);   
    }
    
    public static void matriz(){
        
        String[][] matriz = new String [alunos.size()][3];
        
        for( int i = 0; i < alunos.size(); i++){
            matriz[i][0] = alunos.get(i).getNome();
            matriz[i][1] = alunos.get(i).getMatricula();
            matriz[i][2] = alunos.get(i).getCurso();
        }
        
        int cont = 0;
        for (int i = 0; i < alunos.size(); i++) {
            System.out.printf("\n%d\t", (cont++));
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s\t", matriz[i][j]);
            }
            
        }
    }
    
    public static void imprimir(){
        System.out.println("\t\t\t LISTA \t\t\t");
        for (Aluno i : alunos) {
            System.out.println(i);
        }
        System.out.println("");
    }
    
    public static void alterar() {
        ordenar();
    }
    
    public static void ordenar(){
        //Collections.sort(alunos); ???
        
    }
}