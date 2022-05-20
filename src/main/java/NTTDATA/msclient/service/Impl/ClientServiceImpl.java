package NTTDATA.msclient.service.Impl;

import NTTDATA.msclient.model.Client;
import NTTDATA.msclient.repository.ClientRepository;
import NTTDATA.msclient.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private  final ClientRepository repository;

    @Override
    public Mono<Client> save(Client client) {
        return repository.save(client);
    }

    @Override
    public Mono<Client> findByDni(String dni) {
        return repository.findByDni(dni);
    }

    @Override
    public Mono<Void> delete(Client client) {
        return repository.delete(client);
    }

    @Override
    public Flux<Client> findAll() {
        return repository.findAll();
    }
}
