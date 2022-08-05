import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Decriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnne = new Dev();
        devAnne.setNome("Anne");
        devAnne.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anne" + devAnne.getConteudoIncritos());
        devAnne.progredir();
        devAnne.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Anne" + devAnne.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Anne" + devAnne.getConteudosConcluidos());
        System.out.println("XP: " + devAnne.calcularTotalXp());

        System.out.println("-------------");

        Dev devHeymer = new Dev();
        devHeymer.setNome("Heymer");
        devHeymer.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Heymer" + devHeymer.getConteudoIncritos());
        System.out.println("-");
        devHeymer.progredir();
        devHeymer.progredir();
        devHeymer.progredir();
        System.out.println("Conteúdos Inscritos Heymer" + devHeymer.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Heymer" + devHeymer.getConteudosConcluidos());
        System.out.println("XP: " + devHeymer.calcularTotalXp());


    }
}
