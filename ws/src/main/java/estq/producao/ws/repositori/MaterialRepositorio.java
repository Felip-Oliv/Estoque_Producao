package estq.producao.ws.repositori;

import org.springframework.data.repository.CrudRepository;

import estq.producao.ws.domain.material;

public interface MaterialRepositorio extends CrudRepository<material, Long> {

}
