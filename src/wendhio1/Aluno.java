package wendhio1;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    
    // construtor
    public Aluno (String mat, String name, String course){
       // super();
        setMatricula(mat);
        setNome(name);
        setCurso(course);
    }

    @Override // metódo de impressão.
    public String toString() {
        return "Matricula: " +this.matricula+ "\tNome: " +this.nome+ "\tCurso: " +this.curso; 
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