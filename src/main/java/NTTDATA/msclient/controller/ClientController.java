package NTTDATA.msclient.controller;

import NTTDATA.msclient.entity.Client;
import NTTDATA.msclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;


    @GetMapping("/getClient")
    public Flux<Client> getClient(){
        return clientService.findAll();
    }
    @PostMapping("/postClient")
    Mono<Client> postClient(@RequestBody Client client){
        return clientService.save(client);
    }

    @GetMapping("/getClient/{dni}")
    Mono<Client> getClientByDni(@PathVariable("dni") String dni){
        return clientService.findByDni(dni);
    }

    @PostMapping("/delete/{id}")
    Mono<Void> deleteClient(@PathVariable("id") int id){
        return clientService.deleteClientById(id);

    }

}

