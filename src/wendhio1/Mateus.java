/*
TRATAR EXCEPTIONS E PASSAR TODOS PRINTS SCANS E JANELA PRINCIPAL 
POR OPÇAO PARA SELECIONAR POR NOME OU NUMERO, ALTERAR O NOME 
validar matricula tirar do nome
nao alterar matricula, alterar nome
*/
package Teste;

import java.util.ArrayList;
import java.util.Scanner;
public class Mateus1 
{
    
    public static Scanner ler0 = new Scanner(System.in);
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    public static String[][] matriz = new String[alunos.size()][3];
    static int n = 0;
    
    public static void instaciarAluno(String nome, Integer matricula, String curso) 
    {
        Scanner ler1 = new Scanner(System.in);
        int comp = 1;
        System.out.println("-----CADASTRAMENTO-----");
        do{
            System.out.print("Digite nome do aluno: "); 
            nome      = ler1.nextLine();
            for (int i = 0; i < alunos.size(); i++) {
                comp = 1;
                if(nome.equalsIgnoreCase(alunos.get(i).getNome()))
                {
                    System.err.println("##-Aluno ja possui cadastro, tente novamente!-##");
                    comp = 0;
                }
            }
        }while(comp == 0);
        System.out.print("Digite numero de matricula do aluno: ");
        matricula = ler0.nextInt();
        
                ler0.nextLine();
        System.out.print("Digite codigo do curso do aluno: ");
        curso     = ler0.next();
        
        Aluno novo = new Aluno(nome, matricula, curso);
                alunos.add(novo);
                System.out.println("***-Aluno cadastrado com sucesso-***");
        
    }
        

    public static void criarMatriz() 
    {
        n = 1;
        System.out.println("-----CRIAR MATRIZ-----");
        matriz = new String[alunos.size()][3];
        Integer aux;
        for ( int i = 0 ; i < alunos.size(); i++) {
            matriz[i][0] = alunos.get(i).getNome();
            aux = alunos.get(i).getMatrícula();
            matriz[i][1] = aux.toString();
            matriz[i][2] = alunos.get(i).getCurso();
           
        }
        if(!alunos.isEmpty())
            System.out.println("***-Matriz criada com sucesso!-***");
        else 
            System.err.println("##-Não existe alunos cadastrados!-##");
    }

    public static void imprimirMatriz() 
    {
        System.out.println("-----ALUNOS CADASTRADOS-----");
        if( n== 1)
        {
            if(!alunos.isEmpty())
            {
                for ( int i = 0 ; i < alunos.size(); i++) 
                {
                    System.out.print("|Nome| > "+ matriz[i][0]+" ");
                    System.out.print("|Matricula| > "+ matriz[i][1]+" ");
                    System.out.println("|Curso| > "+ matriz[i][2]+" ");
                }
            }
        else  
            System.err.println("##-Não existe alunos cadastrados!-##");
        }
        else if(alunos.isEmpty())
            System.err.println("##-Não existe alunos cadastrados!-##");
        else
            System.err.println("##-Matriz precisa ser criada  para imprimir!-##");
    }
    
    public static void alterarDados()
    {
        Scanner ler1 = new Scanner(System.in);
        System.out.println("-----ALTERAR DADOS-----");
        if(alunos.size()>0)
        {
            imprimeNoMetodo();
            System.out.print("Digite o nome do aluno que deseja alterar os dados: ");
            String aluno;
            aluno = ler1.nextLine();
            Integer aux;
            String aux1;
            int x = 0;

            for(int i = 0; i<alunos.size(); i++)
            {
                if(aluno.equalsIgnoreCase(alunos.get(i).getNome()))
                {
                    x = 1;
                    System.out.println("> 1 < Alterar matricula");
                    System.out.println("> 2 < Alterar codigo do curso");
                    System.out.println("> 0 < Cancelar operação");
                    System.out.print("Opção: ");
                    aux1 = ler1.next();
                    switch (aux1) 
                    {
                        case "1":
                            System.out.print("Digite nova matricula:");
                            aux = ler1.nextInt();
                            alunos.get(i).setMatrícula(aux);
                            break;
                        case "2":
                            System.out.print("Digite novo codigo de curso:");
                            aux1 = ler1.next();
                            alunos.get(i).setCurso(aux1);
                            break;
                        case "0":
                            break;
                        default:
                            System.err.println("##-Opção invalida!-##");
                            break;
                    }
                }
            }
            if(x == 0)
                System.err.println("##-Aluno não cadastrado-##");
        }
        else
            System.err.println("##-Não existe alunos cadastrados!-##");
    }
    
    public static void excluirAluno() 
    {
        Scanner ler1 = new Scanner(System.in);
        System.out.println("-----EXCLUIR ALUNO-----");
        
        if(alunos.size()>0)
        {   
            imprimeNoMetodo();
            System.out.print("Digite o nome do aluno que deseja excluir: ");
            String aluno = ler1.nextLine();
            int x = 0;
            for(int i = 0; i<alunos.size(); i++)
            {
                if(aluno.equalsIgnoreCase(alunos.get(i).getNome()))
                {
                    alunos.remove(i);
                    System.out.println("***-Aluno excuido com sucesso-***");
                    x = 1;
                }
            }
        if(x == 0)
            System.err.println("##-Aluno nao cadastrado-##");
        }
        else
            System.err.println("##-Não existe alunos cadastrados!-##");
    }
    public static void imprimeNoMetodo(){
        matriz = new String[alunos.size()][3];
        Integer aux;
        for ( int i = 0 ; i < alunos.size(); i++) {
            matriz[i][0] = alunos.get(i).getNome();
            aux = alunos.get(i).getMatrícula();
            matriz[i][1] = aux.toString();
            matriz[i][2] = alunos.get(i).getCurso();
        }
            System.out.println("Alunos cadastrados");
        for ( int i = 0 ; i < alunos.size(); i++) 
            {
            System.out.println("> " + (i+1) +" < " + matriz[i][0].toUpperCase());
            }
        
    }
    
    public static void main(String[] args) 
    {
        Scanner ler1 = new Scanner(System.in);   
        String entrada;
        String nome = null;
        int matricula = 0;
        String curso = null;
        
        System.out.println("\t---- MENU ----");
        System.out.println("> 1 < Instanciar novo aluno");
        System.out.println("> 2 < Criar matriz de alunos");
        System.out.println("> 3 < Imprimir matriz de alunos");
        System.out.println("> 4 < Alterar dados de um aluno");
        System.out.println("> 5 < Excluir um aluno");
        System.out.print("> 0 < Sair do programa\n");
            
        do 
        {
            System.out.print("\nDigite opção do menu: ");
            entrada = ler0.next();
            
            switch(entrada)
            {
                case "0":
                    System.exit(Integer.parseInt(entrada));
                    break;
                    
                case "1":
                    instaciarAluno(nome, matricula, curso);
                    break;
                    
                case "2":
                    
                    criarMatriz();
                    break;
                    
                case "3":
                    imprimirMatriz();
                    break;
                    
                case "4":
                    alterarDados();
                    break;
                    
                case "5":
                    excluirAluno();
                    break;
                    
                default:
                    System.err.println("##-Opção Inválida!-##");
                    break;
            }
        } while (true);
    }
}

