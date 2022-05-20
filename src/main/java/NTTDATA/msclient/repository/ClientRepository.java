package NTTDATA.msclient.repository;

import NTTDATA.msclient.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientRepository extends ReactiveMongoRepository<Client, String> {
    Mono<Client> save(Client client);
    Mono<Client> findByDni(String dni);
    Mono<Void> delete(Client client);
    Flux<Client> findAll();
}
