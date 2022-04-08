package estq.producao.ws.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MaterialProcesso implements Serializable {

    @Embeddable
    public static class IDComposto implements Serializable {
        @Column(name="id_material")
        private long idMaterial;
        @Column(name="id_processo")
        private long idProcesso;
    }

    @EmbeddedId
    private IDComposto id = new IDComposto();

    @ManyToOne
    @JoinColumn(name = "id_material", insertable=false, updatable=false)
    private Material material;

    @ManyToOne
    @JoinColumn(name = "id_processo", insertable=false, updatable=false)
    private Processo processo;

    @Column(name="quantidade_consumida", precision=2)
    private int quantidadeConsumida;

    public int getQuantidadeConsumida() {
        return quantidadeConsumida;
    }

    public void setQuantidadeConsumida(int quantidadeConsumida) {
        this.quantidadeConsumida = quantidadeConsumida;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public IDComposto getId() {
        return id;
    }

    public void setId(IDComposto id) {
        this.id = id;
    }
}