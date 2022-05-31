package NTTDATA.msclient.repository;

import NTTDATA.msclient.entity.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {
    Mono<Client> save(Client client);
    Mono<Client> findByDni(String dni);
//    Mono<Void> delete(Client client);
    Flux<Client> findAll();

    Mono<Void> deleteClientById(int id);
}
