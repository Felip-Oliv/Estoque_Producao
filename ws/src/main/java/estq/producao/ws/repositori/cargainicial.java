package estq.producao.ws.repositori;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import estq.producao.ws.domain.material;

@Configuration
public class cargainicial {
    private static final Logger log = LoggerFactory.getLogger(cargainicial.class);

    @Bean
    CommandLineRunner iniciarDb(MaterialRepositorio repository) {
        return args -> {
            log.info("carregando..." + repository.save(new material("Pedra", 125, 50, "5 pacotes")));
            log.info("carregando..." + repository.save(new material("Areia", 300, 50, "10 pacotes")));
        };
    }
}
