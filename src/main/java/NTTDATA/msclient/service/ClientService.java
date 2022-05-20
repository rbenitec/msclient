package NTTDATA.msclient.service;

import NTTDATA.msclient.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    public Mono<Client> save(Client client);
    public Mono<Client> findByDni(String dni);
    public Mono<Void> delete(Client client);
    public Flux<Client> findAll();
}
