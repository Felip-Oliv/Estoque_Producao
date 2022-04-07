package estq.producao.ws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Setor {

    @Id
    @GeneratedValue
    private long id;
    private String cod;

    public Setor() {

    }

    public Setor(String cod, String descricao) {
        this.cod = cod;
    }

    public void atualizarSetor(Setor SetorAlterado) {
        this.cod = SetorAlterado.getcod();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getcod() {
        return cod;
    }

    public void setcod(String cod) {
        this.cod = cod;
    }

}
