package estq.producao.ws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import estq.producao.ws.domain.material;

@RestController
public class materiaController<MateriaPrimaRepository> {

    private final materiaController repository;

    @GetMapping("/material")
    materiaController(MateriaPrimaRepository repository(){ this.repository -> repository;});

    Iterable<material> listar() {
        return repository.findAll();
    }

    @PostMapping("/material")
    material incluir(@RequestBody material novoMaterial) {
        return repository.save(novoMaterial);
    }

    @GetMapping("/material/{id}")
    material buscarporid(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/material/{id}")
    material atualizar(@RequestBody material materialAlterada, @PathVariable Long id){
        return repository.findById(id)
        .map(material ->{
            material.setNome(pessoaAlterada.getNome());
            return repository.save(pessoa
            });
        .orElseGet(() ->{
            materialAlterada.setId(id);
            return repository.save(materialAlterada);
            });	
        }
        @DeleteMapping("/material/{id}")
        void excluir(@PathVariable Long id){
            repository.deleteByID(id);
            }

}
