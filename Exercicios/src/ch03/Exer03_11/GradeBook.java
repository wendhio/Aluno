/*
 * Modifique a classe GradeBook (Figura 3.10) como segue:
 * a) Inclua uma segunda variável de instância  String que representa o nome do instrutor
 * do curso.
 * b) Forneça um método set para alterar o nome do instrutor e um método get para recuperá-lo.
 * c) Modifique  o construtor para especificar dois parâmetros - um para o nome do curso e
 * outro para o nome do instrutor.
 * d) Modifique o método displayMessage de tal maneira que ele primeiro gere a saída da
 * mensagem de boas-vindas e o nome do curso e depois a saída de "This course is presented by:"
 * seguido pelo nome do instrutor.
 * 
 * Utilize sua classe modificada em um aplicativo de teste que demontra as novas capacidades da
 * classe.
 */

package ch03.Exer03_11;

public class GradeBook 
{
    private String courseName;
    private String instrutor;

    public GradeBook(String name, String nome) {
        courseName = name;
        instrutor = nome;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public void setInstrutor(String nome) {
        instrutor = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the GradeBook for\n%s!\n", getCourseName());
        System.out.printf("This course is presented by:\n%s!\n", getInstrutor());
    }
   
   
}
