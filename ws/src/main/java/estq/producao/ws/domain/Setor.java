package estq.producao.ws.domain;

public class Setor {
    private final long id;
    private final String cod;

    public Setor(long id, String cod) {
        this.id = id;
        this.cod = cod;

    }

    public long getId() {
        return id;

    }

    public String getCod() {
        return cod;
    }
}
