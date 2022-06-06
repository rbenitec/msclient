package NTTDATA.msclient.controller;

import NTTDATA.msclient.entity.Client;
import NTTDATA.msclient.repository.model.CurrentAccount;
import NTTDATA.msclient.service.ClientService;
import NTTDATA.msclient.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    OperationService operationService;

    @Autowired
    ClientService clientService;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/getClient")
    Flux<Client> getClient(){
        return clientService.findAll();
    }
    @PostMapping("/create")
    Mono<Client> postClient(@RequestBody Client client){
        String createClientErrorMessage = "The  application could NOT create the client";
        String createClientSuccessMessage = "The application create the client";
        return clientService.save(client);

    }

    @GetMapping("/getClient/{dni}")
    Mono<Client> getClientByDni(@PathVariable("dni") String dni){
        return clientService.findByDni(dni);
    }

    @PostMapping("/delete/{id}")
    Mono<Void> deleteClient(@PathVariable("id") String id){
        return clientService.deleteClientById(id);

    }

    /*
    @GetMapping("/GetCurrent/{clientId}")
    Flux<CurrentAccount> getCurrentAccounts (@PathVariable("clientId") String clientId){
        //return operationService.getCurrentAccounts(clientId);
        return webClientBuilder.build()
                .get()
                .uri("http://service-currentaccounts/current/byclient/"+clientId)
                .retrieve()
                .bodyToFlux(CurrentAccount.class);
    }*/

    @GetMapping("/GetCurrent/{clientId}")
    Flux<CurrentAccount> getCurrentAccounts (@PathVariable("clientId") String clientId){
        return operationService.getCurrentAccounts(clientId);

    }


}

