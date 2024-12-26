import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Set<Curso> cursos;
    private Set<Mentoria> mentorias;
    private Set<Dev> devsInscritos;

    // Construtor
    public Bootcamp(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cursos = new HashSet<>();
        this.mentorias = new HashSet<>();
        this.devsInscritos = new HashSet<>();
    }

    // Métodos para adicionar cursos, mentorias e devs
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devsInscritos.add(dev);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", cursos=" + cursos +
                ", mentorias=" + mentorias +
                ", devsInscritos=" + devsInscritos +
                '}';
    }
}
