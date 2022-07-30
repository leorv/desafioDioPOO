import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
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

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Descrição do bootcamp.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev leonardo = new Dev();
        leonardo.setNome("leonardo");
        leonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leonardo: " + leonardo.getConteudosInscritos());
        leonardo.progredir();
        System.out.println("Conteúdos inscritos Leonardo depois de progredir: " + leonardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Leonardo: " + leonardo.getConteudosConcluidos());
        System.out.println("XP Leonardo: " + leonardo.calcularTotalXP());

        Dev joao= new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + joao.getConteudosInscritos());
        leonardo.progredir();
        System.out.println("Conteúdos inscritos João depois de progredir: " + joao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + joao.getConteudosConcluidos());
        System.out.println("XP João: " + joao.calcularTotalXP());
    }
}
