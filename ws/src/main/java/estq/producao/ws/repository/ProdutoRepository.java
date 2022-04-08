package estq.producao.ws.repository;

import estq.producao.ws.domain.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}