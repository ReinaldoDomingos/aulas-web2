package br.ufms.cpcx.reinaldo.service;

import br.ufms.cpcx.reinaldo.entity.Cliente;
import br.ufms.cpcx.reinaldo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        if (cliente.getIdade() >= 18L) {
            return clienteRepository.save(cliente);
        }

        throw new RuntimeException("Idade");
    }

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    public Object alterar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
