package estq.producao.ws.repository;

import org.springframework.data.repository.CrudRepository;

import estq.producao.ws.domain.Material;

public interface MaterialRepository extends CrudRepository<Material, Long> {

}
