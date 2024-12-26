import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos;
    private Set<Mentoria> mentoriasParticipadas;

    // Construtor
    public Dev(String nome) {
        this.nome = nome;
        this.cursosInscritos = new HashSet<>();
        this.mentoriasParticipadas = new HashSet<>();
    }

    // Métodos para inscrever em curso
    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    // Método para participar de mentoria
    public void participarMentoria(Mentoria mentoria) {
        mentoriasParticipadas.add(mentoria);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Mentoria> getMentoriasParticipadas() {
        return mentoriasParticipadas;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", cursosInscritos=" + cursosInscritos +
                ", mentoriasParticipadas=" + mentoriasParticipadas +
                '}';
    }
}
