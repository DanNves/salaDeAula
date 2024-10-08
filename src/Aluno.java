public class Aluno {
    //Atributo
    private String nome;
    private Integer matricula;

    public Aluno() {

    }

    //Construtor
    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nAluno: "+ nome + "\n Matrícula: " + matricula;
    }
}
