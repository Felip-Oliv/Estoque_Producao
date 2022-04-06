package estq.producao.ws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class material {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int validade;
    private int quantidade;
    private String unidade;

    public material(String name, int validade, int quantidade, String unidade) {
        this.name = name;
        this.validade = validade;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public material() {
    }

    public material(long id, String name, int validade) {
        this.id = id;
        this.name = name;
        this.validade = validade;
    }

    public material(long id, String name, int validade, int quantidade, String unidade) {
        this.id = id;
        this.name = name;
        this.validade = validade;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public long getId() {
        return id;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }
}
