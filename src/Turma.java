public class Turma {
    //Atributos
    private Laboratorio laboratorio;
    private Disciplina disciplina;
    private Curso curso;
    private Computador computador;
    private Professor professor;
    private Aluno[] alunos;

    public Turma(){

    }

    //Construtor
    public Turma(Laboratorio laboratorio, Disciplina disciplina, Curso curso, Computador computador, Professor professor, Aluno[] alunos) {
        this.laboratorio = laboratorio;
        this.disciplina = disciplina;
        this.curso = curso;
        this.computador = computador;
        this.professor = professor;
        this.alunos = alunos;
    }

    //Getter and Setter
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


}


