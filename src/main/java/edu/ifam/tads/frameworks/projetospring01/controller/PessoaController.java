package edu.ifam.tads.frameworks.projetospring01.controller;

import edu.ifam.tads.frameworks.projetospring01.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController {
    @RequestMapping(value = "/pessoa/find", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Pessoa> find(){
        List<Pessoa> pessoa = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Maria");
        pessoa1.setTelefone("91234-5678");
        pessoa1.setEmail("maria@email.com");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setTelefone("91234-5678");
        pessoa2.setEmail("maria@email.com");

        pessoa.add(pessoa1);
        pessoa.add(pessoa2);

        return pessoa;

    }
}
