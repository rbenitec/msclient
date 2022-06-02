package NTTDATA.msclient.service.implemt;

import NTTDATA.msclient.entity.Client;
import NTTDATA.msclient.repository.ClientRepository;
import NTTDATA.msclient.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public Mono<Client> save(Client client) {

        return repository.save(client);
    }

    @Override
    public Mono<Client> findByDni(String dni) {

        return repository.findByDni(dni);
    }

    @Override
    public Mono<Void> deleteClientById(String id) {

        return repository.deleteById(id);
    }

    @Override
    public Flux<Client> findAll() {
        return repository.findAll();
    }
}
