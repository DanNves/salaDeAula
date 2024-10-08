public class Computador {
    //Atributo
    private String modelo;
    private String processador;
    private int memoriaRam;

    public Computador() {

    }


    //Construtor
    public Computador(String modelo, String processador, int memoriaRam) {
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }

    //Getter and Setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "Computador Modelo: "+ this.getModelo() + "\n Processador: " + this.getProcessador()
                + "\n Memória RAM: "+ this.getMemoriaRam();
    }
}
