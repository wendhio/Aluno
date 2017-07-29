package wendhio1;
 
//@author: Wendhio Thalison Neres dos Santos
//@Matricula: 201600017249

import java.util.ArrayList;
import java.util.Scanner;

public class Wendhio1 {
    
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
    //Método Cadastra Aluno. 
    public static void instanciar(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matricula: ");
        String mat = input.nextLine();
        boolean flag = buscaMat(mat); //Procura se a matricula já existe
        if (!flag){
            System.out.println("Nome: ");
            String nome = input.nextLine();
            System.out.println("Curso: ");
            String curso = input.nextLine();
            Aluno x = new Aluno(mat, nome, curso); 
            alunos.add(x); //salva no arrayList
            System.out.println("Aluno Cadastrado!");
        }else{
            System.err.println("Aluno já existente!\nTente Novamente!");
        }
    }
    //Método crias Matriz{n][3]
    private static void criarMatriz(){
        
        matriz = new String[alunos.size()][3];
        
        if( !alunos.isEmpty()){ //Verificar se o ArrayList é vazio/null.
            for( int i = 0; i < alunos.size(); i++){
                matriz[i][0] = alunos.get(i).getMatricula(); 
                matriz[i][1] = alunos.get(i).getNome();
                matriz[i][2] = alunos.get(i).getCurso();
            }
            System.out.println("Matriz Criada!");
        }else{
            System.err.println("Matriz Vazia!\nÉ necessário instanciar para "
                            + "criar a Matriz\nEscolha a opção 1 - Instanciar");
        }
    }
    //Método busca matricula dos alunos
    public static boolean buscaMat( String str){
        
        if( alunos.size() > 0){
            for (int i = 0; i < alunos.size(); i++) {
                if (str.equalsIgnoreCase(alunos.get(i).getMatricula())) {
                    return true;
                }
            }
        }
            return false;
    }
    //Métdo busca aluno
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
    //Imprimi a matriz
    public static void imprimir(){
        
        criarMatriz();
        System.out.println("");
        
        System.out.println("\t\t\t LISTA DE ALUNOS \t\t\t");
        for(int i = 0; i < matriz.length; i++){
            System.out.printf("Matricula: %10s ", matriz[i][0]);
            System.out.printf("\tNome: %40s", matriz[i][1]);
            System.out.println("\tCurso: " + matriz[i][2]);
        }
        
        System.out.println("\t\t\t FIM \t\t\t");
    }
    //Imprimi alunos salvos no arrayList        
    public static void verSalvos(){
        System.out.println("\t\t\t LISTA DE ALUNOS \t\t\t");
        for (Aluno i : alunos) {
            System.out.println(i);
        }
        System.out.println("FINAL");
    }
    //Método que altera o Nome e curso do aluno.
    public static void alterar() {
        
        Scanner input = new Scanner( System.in );
        verSalvos();
        System.out.println("Digite a matricula do aluno que deseja alterar: ");
        String aux = input.nextLine();
        Aluno student = buscaAluno(aux);
        
            if( student != null){
                boolean stop = true; //condição de parada
                do{ 
                    System.out.println("Digite:\n0 - Sair\n1 - Alterar Nome"
                                        + "\n2 - Alterar Curso");
                    short opcao = input.nextShort();
                    input.nextLine(); // limpa buffer da memória
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
                System.err.println("Matricula Inválida!");
            }
    }
    //Método Exclui o objeto aluno de uma posição.
    public  static void excluir(){
        
        Scanner input = new Scanner( System.in);
        verSalvos();
        
        System.out.println("Digite a matricula do aluno que deseja excluir: ");
        String aux = input.nextLine();
        
        boolean comp = buscaMat(aux);
        
        for ( int i = 0; i < alunos.size(); i++){
            if(comp){
                alunos.remove(i);
                System.out.println("Aluno Excluído");
            } else {
                System.err.println("Matricula Inexistente!");
            }
        }
    }
}