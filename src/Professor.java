public class Professor {
    //Atributo
    private String nome;

    public Professor(){

    }

    //Construtor
    public Professor(String nome) {
        this.nome = nome;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Professor: "+ this.getNome();
    }
}
