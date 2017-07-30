package wendhio1;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    
    public Aluno (String mat, String name, String course){
        setMatricula(mat);
        setNome(name);
        setCurso(course);
    }

    @Override
    public String toString() {
        return "Matricula: " +this.matricula+ "\t\t\t\tNome: " +this.nome+ "\t\t\t\tCurso: " +this.curso; 
    }
    
    public void setMatricula( String matricula ){
        this.matricula = matricula;
    }
    
    String getMatricula(){ return matricula; }
    
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    String getNome(){ return nome; }
    
    public void setCurso( String curso ){
        this.curso = curso;
    }
    
    String getCurso(){ return curso; }
}