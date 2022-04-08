package estq.producao.ws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Processo {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "processo")
    private List<MaterialProcesso> materiais;

    public Processo() {

    }

    public Processo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void atualizarProcesso(Processo processoAlterado) {
        this.nome = processoAlterado.getNome();
        this.descricao = processoAlterado.getDescricao();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public List<MaterialProcesso> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<MaterialProcesso> materiais) {
        this.materiais = materiais;
    }
}
