package NTTDATA.msclient.controller;

import NTTDATA.msclient.model.Client;
import NTTDATA.msclient.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    public Mono<ServerResponse> create(ServerRequest request){
        Mono<Client> clientMono = request.bodyToMono(Client.class);
        return clientMono
                .flatMap(clientService::save)
                .flatMap(r -> ServerResponse.created(URI.create("/client/".concat(r.getDni())))
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(r));

    }
}

