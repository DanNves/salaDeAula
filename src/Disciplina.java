public class Disciplina {
    //Atributo
    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Disciplina() {

    }

    //Construtor
    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina: "+ this.getNome() + "\n Código: "+ this.getCodigo() +
                "\n Carga Horária: "+ this.getCargaHoraria()+"H";
    }
}
