package br.ufms.cpcx.reinaldo.controller;

import br.ufms.cpcx.reinaldo.entity.Cliente;
import br.ufms.cpcx.reinaldo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<?> buscar() {

        return new ResponseEntity(clienteService.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> buscarPorId(@PathVariable("id") Long id) {

        return new ResponseEntity(clienteService.buscarPorId(id), HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Cliente cliente) {

        return new ResponseEntity(clienteService.salvar(cliente), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
        clienteService.deletar(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> alterar(@PathVariable("id") Long id, @RequestBody Cliente cliente) {

        return new ResponseEntity(clienteService.alterar(cliente), HttpStatus.ACCEPTED);
    }
}
