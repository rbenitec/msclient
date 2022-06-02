package NTTDATA.msclient.service.implemt;

import NTTDATA.msclient.model.CurrentAccount;
import NTTDATA.msclient.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationServiceImp implements OperationService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Flux<CurrentAccount> getCurrentAccounts(String clientId) {
        List<CurrentAccount> currentAccounts = restTemplate.getForObject("http://service-currentaccounts/current/byclient/"+clientId, List.class);
        //Flux<CurrentAccount> currentAccount = restTemplate.getForObject("http://service-currentaccounts/current/byclient/"+clientId, Flux.class);
        return Flux.fromIterable(currentAccounts);
    }
}
