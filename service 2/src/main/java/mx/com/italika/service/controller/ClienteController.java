package mx.com.italika.service.controller;

import mx.com.italika.service.entity.Cliente;
import mx.com.italika.service.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;





import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Cliente> getAll(){
        return      clienteRepository.findAll();
    }

    @PostMapping(value = "/")
    @ResponseBody
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
