import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criando uma turma
        /*Turma t1 = new Turma(new Laboratorio("LAMI 5, Sala 402",45),
                new Disciplina("POO(Programação Orientada a Objeto","P2024",60),
                new Curso("ADS(Análise e Desenvolvimento de Sistemas","ADS2024",2),
                new Computador("Dell","Intel i5", 8),
                new Professor("Grande Fiasco"),
                new Aluno[]{
                        new Aluno("João",55555),
                        new Aluno("Maria",33333),
                        new Aluno("Mariana", 33315),
                        new Aluno("Joanderson", 33334),
                        new Aluno("Ana", 33335),
                        new Aluno("Pedro", 33336),
                        new Aluno("Lucas", 33337),
                        new Aluno("Beatriz", 33338),
                        new Aluno("Gustavo", 33339),
                        new Aluno("Mariana", 33340),
                        new Aluno("Felipe", 33341),
                        new Aluno("Larissa", 33342),
                        new Aluno("Rafael", 33343),
                        new Aluno("Gabriela", 33344),
                        new Aluno("Bruno", 33345),
                        new Aluno("Fernanda", 33346),
                        new Aluno("Leonardo", 33347),
                        new Aluno("Amanda", 33348),
                        new Aluno("Eduardo", 33349),
                        new Aluno("Julia", 33350),
                        new Aluno("Matheus", 33351),
                        new Aluno("Aline", 33352),
                        new Aluno("Thiago", 33353),
                        new Aluno("Camila", 33354),
                        new Aluno("Rodrigo", 33355),
                        new Aluno("Patricia", 33356),
                        new Aluno("Diego", 33357),
                        new Aluno("Carolina", 33358),
                        new Aluno("Vinicius", 33359),
                        new Aluno("Isabela", 33360),
                        new Aluno("André", 33361),
                        new Aluno("Sara", 33362),
                        new Aluno("Marcos", 33363),
                        new Aluno("Paula", 33364),
                        new Aluno("Renato", 33365)

                    }
                );
        System.out.println();
        System.out.println("---------------------|TURMA T1|---------------------");
        System.out.println(t1.getDisciplina() + "\n");
        System.out.println(t1.getProfessor() + "\n");
        System.out.println(t1.getLaboratorio() + "\n");
        System.out.println(t1.getCurso() + "\n");
        System.out.println(t1.getComputador() + "\n");
        System.out.print("---------------------|ALUNOS|------------------------");
        Aluno[] alunos = t1.getAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }*/

        //Pedindo ao usuário para settar os dados da turma
        Laboratorio lb2 = new Laboratorio();
        System.out.print("Informe o nome do Laboratorio: ");
        lb2.setNome(sc.nextLine());
        System.out.print("Informe a capacidade do Laboratorio: ");
        lb2.setCapacidade(sc.nextInt());

        Disciplina d2 = new Disciplina();
        System.out.println("Informe o nome do Disciplina: ");
        d2.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Informe o código da Disciplina: ");
        d2.setCodigo(sc.nextLine());
        System.out.println("Informe a carga horária da Disciplina: ");
        d2.setCargaHoraria(sc.nextInt());

        Curso c2 = new Curso();
        System.out.println("Informe o nome do Curso: ");
        c2.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Informe o código do Curso: ");
        c2.setCodigo(sc.nextLine());
        System.out.println("Informe a duração do Curso: ");
        c2.setDuracao(sc.nextInt());

        Computador pc2 = new Computador();
        System.out.println("Informe o modelo do Computador: ");
        pc2.setModelo(sc.nextLine());
        sc.nextLine();
        System.out.println("Informe o processador do Computador: ");
        pc2.setProcessador(sc.nextLine());
        System.out.println("Informe a capacidade da MemóriaRAM: ");
        pc2.setMemoriaRam(sc.nextInt());

        Professor prof2 = new Professor();
        System.out.println("Informe o nome do Professor: ");
        prof2.setNome(sc.nextLine());

        Aluno[] alunos = new Aluno[3];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println("Informe o nome do Aluno: ");
            alunos[i].setNome(sc.nextLine());
            System.out.println("Informe a matricula do Aluno: ");
            alunos[i].setMatricula(sc.nextInt());
        }

        Turma t2 = new Turma(lb2,d2,c2,pc2,prof2,alunos);

        sc.close();
    }
}































