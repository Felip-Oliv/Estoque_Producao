package estq.producao.ws.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import estq.producao.ws.domain.Setor;

@RestController
public class SetorController {

    @GetMapping("/listar") // mepear como get
    public String listar(@RequestParam(value = "cod", defaultValue = "Mundo") String cod) {
        return String.format("Olá %!", cod);

    }

    private final AtomicLong idGenerator = new AtomicLong();

    @GetMapping("/Setor") // mapea como get
    public Setor Setor(@RequestParam(value = "cod", defaultValue = "Codigo não informado") String cod) {
        return new Setor(idGenerator.incrementAndGet(), cod);

    }

}
