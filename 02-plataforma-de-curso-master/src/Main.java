import br.com.plataformacurso.dominio.Aluno;
import br.com.plataformacurso.dominio.Bootcamp;
import br.com.plataformacurso.dominio.Curso;
import br.com.plataformacurso.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(80);

        /*
        System.out.println(curso);
        System.out.println();
         */

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(mentoria);
        System.out.println();
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição do bootcamp");
        bootcamp.getConteudo().add(curso);
        bootcamp.getConteudo().add(mentoria);

        Aluno aluno = new Aluno();
        aluno.setNome("André Luiz");
        aluno.inscreverBootcamp(bootcamp);

        System.out.println(aluno.getNome());
        System.out.println("Conteudos inscritos: " + aluno.getConteudosInscritos());
        aluno.progredir();
        System.out.println("Conteudos Concluidos: " + aluno.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + aluno.getConteudosInscritos());
        System.out.println("XP: "+ aluno.calcularTotalXp());

    }
}