import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescriçao("mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescriçao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev DevJose = new Dev();
        DevJose.setNome("Jose");
        DevJose.increverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Jose: " + DevJose.getConteudosInscritos());
        DevJose.progredir();
        System.out.println("Conteudo concluidos Jose: " + DevJose.getConteudosConcluidos());
        System.out.println("XP: " + DevJose.calcularTotalXP());

        Dev DevReynan = new Dev();
        DevReynan.setNome("Reynan");
        DevReynan.increverBootcamp(bootcamp);
        DevReynan.progredir();
        System.out.println("Conteudo inscritos Reynan: " + DevReynan.getConteudosInscritos());
        System.out.println("XP: " + DevJose.calcularTotalXP());
    }
}
