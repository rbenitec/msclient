package NTTDATA.msclient.service.implemt;

import NTTDATA.msclient.config.ClientWebClient;
import NTTDATA.msclient.repository.model.CurrentAccount;
import NTTDATA.msclient.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class OperationServiceImp implements OperationService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ClientWebClient clientWebClient;


    @Override
    public Flux<CurrentAccount> getCurrentAccounts(String clientId) {
        //return clientWebClient.getWebClient().get().uri("/byclient/"+clientId);
        return (Flux<CurrentAccount>) clientWebClient.getWebClient().get().uri("/byclient/"+clientId);
    }

    /*
    @Override
    public Flux<CurrentAccount> getCurrentAccounts(String clientId) {
        List<CurrentAccount> currentAccounts = restTemplate.getForObject("http://service-currentaccounts/current/byclient/"+clientId, List.class);
        //Flux<CurrentAccount> currentAccount = restTemplate.getForObject("http://service-currentaccounts/current/byclient/"+clientId, Flux.class);
        return Flux.fromIterable(currentAccounts);
    }
    */

    //Aplicando el Web client para obtener una cuenta por codigo del cliente


}
