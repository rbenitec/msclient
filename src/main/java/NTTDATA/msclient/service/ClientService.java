package NTTDATA.msclient.service;

import NTTDATA.msclient.entity.Client;
import NTTDATA.msclient.model.CurrentAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    public Mono<Client> save(Client client);
    public Mono<Client> findByDni(String dni);
    public Mono<Void> deleteClientById(String id);
    public Flux<Client> findAll();



}
