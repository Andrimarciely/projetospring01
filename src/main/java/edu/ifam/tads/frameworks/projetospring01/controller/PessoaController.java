package edu.ifam.tads.frameworks.projetospring01.controller;

import edu.ifam.tads.frameworks.projetospring01.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PessoaController {
    @RequestMapping(value = "/pessoa/find", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Pessoa find(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setTelefone("91234-5678");
        pessoa.setEmail("maria@email.com");
        return pessoa;

    }
}
