package estq.producao.ws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Material {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private int validade;
    private int quantidade;
    private String unidade;

    public Material() {
    }

    public Material(long id, String name, int validade, int quantidade, String unidade) {
        this.id = id;
        this.name = name;
        this.validade = validade;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public Material(String name, int validade, int quantidade, String unidade) {
        this.name = name;
        this.validade = validade;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public Material(long id, String name, int validade) {
        this.id = id;
        this.name = name;
        this.validade = validade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void atualizarMaterial(Material materialAtualizado) {
        this.name = materialAtualizado.getName();
        this.validade = materialAtualizado.getValidade();
        this.quantidade = materialAtualizado.getQuantidade();
        this.unidade = materialAtualizado.getUnidade();
    }
}
