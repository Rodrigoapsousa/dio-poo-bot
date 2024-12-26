import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso("Curso Java", "Aprenda Java do básico ao avançado", 120);
        Curso curso2 = new Curso("Curso Python", "Aprenda Python do básico ao avançado", 100);

        // Criando mentorias
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Tire dúvidas sobre o curso de Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria Python", "Tire dúvidas sobre o curso de Python", LocalDate.now().plusDays(1));

        // Criando devs
        Dev dev1 = new Dev("Carlos");
        Dev dev2 = new Dev("Ana");

        // Inscrevendo devs em cursos
        dev1.inscreverCurso(curso1);
        dev2.inscreverCurso(curso2);

        // Participando de mentorias
        dev1.participarMentoria(mentoria1);
        dev2.participarMentoria(mentoria2);

        // Criando o bootcamp e adicionando os elementos
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java e Python", "Aprenda Java e Python com especialistas", LocalDate.now(), LocalDate.now().plusMonths(1));
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarMentoria(mentoria2);
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        // Imprimindo informações do bootcamp
        System.out.println(bootcamp);
    }
}

