public class Curso {
    //Atributo
    private String nome;
    private String codigo;
    private int duracao;

    public Curso() {

    }


    //Construtor
    public Curso(String nome, String codigo, int duracao) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Curso: "+ this.getNome() + "\n Código: "+ this.getCodigo()
                + "\n Duração: "+ this.getDuracao() +"Anos";
    }
}
