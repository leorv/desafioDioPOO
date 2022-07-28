import java.time.LocalDate;

import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descrição do curso Angular");
        curso2.setCargaHoraria(32);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Conteudo curso = new Curso();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
