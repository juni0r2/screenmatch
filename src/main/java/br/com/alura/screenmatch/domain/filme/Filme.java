package br.com.alura.screenmatch.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer anoLancamento;
    @Column(name = "duracao_em_minutos")
    private Integer duracao;
    private String genero;

    public Filme() {
    }

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.anoLancamento = dados.ano();
        this.duracao = dados.duracao();
        this.genero = dados.genero();
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void atualizaDados(DadosAlteracaoFilme dados) {
        this.nome = dados.nome();
        this.duracao = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }
}
