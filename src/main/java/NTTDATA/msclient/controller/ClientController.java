package NTTDATA.msclient.controller;

import NTTDATA.msclient.model.Client;
import NTTDATA.msclient.service.ClientService;
import com.google.common.annotations.GwtCompatible;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

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
    Mono<Void> deleteClient(@PathVariable("id") String id){
        return clientService.deletebyId(id);

    }

}

