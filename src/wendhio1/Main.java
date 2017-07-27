package wendhio1;
 
//@author: Wendhio Thalison Neres dos Santos
//@Matricula: 201600017249

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static String[][] matriz = new String [alunos.size()][3];   
             
    public static void main(String[] args) {
      
        boolean stop = true; // condição de parada.
        
        do{
            Scanner input = new Scanner (System.in);
            
            System.out.println("\n\t\t MENU \t\t");
            System.out.println("Escolha um número abaixo:");
            System.out.println("0 - Sair\n1 - Instanciar\n2 - Criar\n3 - Imprimir\n"
                                +"4 - Alterar\n5 - Excluir");
            
            int opcao; 
            opcao = input.nextInt();
            switch(opcao){
                case 0: stop = false;
                    break;
                case 1:  instanciar();
                    break;
                case 2: criarMatriz();     
                    break;
                case 3: imprimir();
                    //verSalvos();
                    break;
                case 4: alterar();
                    break;
                case 5: excluir();    
                    break;
                default:
                    System.err.println("Entrada Inválida!\nDigite novamente!");    
            }
        }while(stop);
    }
     
    public static void instanciar(){
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Matricula: ");
        String mat = input.nextLine();
        boolean flag = buscaMat(mat);
        if (!flag){
            System.out.println("Nome: ");
            String nome = input.nextLine();
            System.out.println("Curso: ");
            String curso = input.nextLine();
            Aluno x = new Aluno(mat, nome, curso);
            alunos.add(x);
            System.out.println("Aluno Cadastrado!");
        }else{
            System.err.println("Aluno já existente!\nTente Novamente!");
        }
    }
    
    private static void criarMatriz(){
        
        matriz = new String[alunos.size()][3];
        
        if( !alunos.isEmpty()){
            for( int i = 0; i < alunos.size(); i++){
                matriz[i][0] = alunos.get(i).getMatricula();
                matriz[i][1] = alunos.get(i).getNome();
                matriz[i][2] = alunos.get(i).getCurso();
            }
            System.out.println("Matriz Criada!");
        }else{
            System.err.println("Matriz Vazia!\nÉ necessário instanciar para 1"
                            + "criar a Matriz\nEscolha a opção 1 - Instanciar");
        }
    }
    
    public static boolean buscaMat( String str){
        
        if ( alunos.size() > 0){
            for (int i = 0; i < alunos.size(); i++) {
                if (str.equalsIgnoreCase(alunos.get(i).getMatricula())) {
                    return true;
                }
            }
        }
            return false;
    }
    
    public static Aluno buscaAluno( String str){
        
        if ( alunos.size() > 0){
            for (int i = 0; i < alunos.size(); i++) {
                if (str.equalsIgnoreCase(alunos.get(i).getMatricula())) {
                    return alunos.get(i);
                }
            }
        }
            return null;
    }
    
    public static void imprimir(){
        
        if(!alunos.isEmpty()){
            System.out.println("\t\t\t LISTA DE ALUNOS \t\t\t");
            for (int i = 0; i < matriz.length; i++) {
                if( alunos.size() > matriz.length){ 
                    System.err.println("Alterada!");
                } else {
                    System.out.printf("Matricula: %10s ", matriz[i][0]);
                    System.out.printf("\tNome: %40s", matriz[i][1]);
                    System.out.println("\tCurso: " +matriz[i][2]);
                }
            }   
        }else{
            System.err.println("Lista Vazia!\nÉ necessário criar a Matriz\n"
                                +"Escolha a opção 2 - Criar Matriz");
        }
        System.out.println("\t\t\t FIM \t\t\t");
    }
            
    public static void verSalvos(){
        System.out.println("\t\t\t LISTA DE ALUNOS \t\t\t");
        for (Aluno i : alunos) {
            System.out.println(i);
        }
        System.out.println("FINAL");
    }
    
    public static void alterar() {
        
        Scanner input = new Scanner( System.in );
        verSalvos();
        System.out.println("Digite a matricula do aluno que deseja alterar: ");
        String aux = input.nextLine();
        Aluno student = buscaAluno(aux);
        
            if( student != null){
                boolean stop = true;
                do{ 
                    System.out.println("Digite:\n0 - Sair\n1 - Alterar Nome"
                            + "\n2 - Alterar Curso");
                    short opcao = input.nextShort();
                    input.nextLine();
                    switch(opcao){
                        case 0 :
                            stop = false;
                            break;
                        case 1 : 
                            System.out.println("Novo Nome: ");
                           // input.nextLine();
                            String novoNome = input.nextLine();
                            student.setNome(novoNome);
                            break;
                        case 2 :
                            System.out.println("Novo Curso: ");
                            //input.nextLine();
                            String course = input.nextLine();
                            student.setCurso(course);
                            break;
                        default:
                            System.err.println("Entrada Inválida!");
                            break;

                    }
                }while(stop);
            } else {
                System.err.println("Matricula Invalida!");
            }
    }
    
    public  static void excluir(){
        // Erro ao excluir: duplicado e o errado...
        Scanner input = new Scanner( System.in);
        
        System.out.println("Digite a matricula do aluno que deseja excluir: ");
        String aux = input.nextLine();
        
        boolean comp = buscaMat(aux);
        
        for ( int i = 0; i < alunos.size(); i++){
            if(comp){
                alunos.remove(i);
                JOptionPane.showMessageDialog( null, "excluido!");
                //System.out.println("Excluído");
            } else {
                JOptionPane.showMessageDialog( null, "Inexistente!");
                //System.err.println("Matricula inexistente!");
            }
        }
    }
 
}