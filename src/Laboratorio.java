public class Laboratorio {
    //Atributo
    private String nome;
    private int capacidade;

    public Laboratorio() {

    }


    //Construtor
    public Laboratorio(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString(){
        return "Laboratório: "+ this.getNome() + "\n Capacidade: "+ this.getCapacidade() +" Alunos";
    }
}
