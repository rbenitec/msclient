package NTTDATA.msclient.controller;

import NTTDATA.msclient.model.CurrentAccount;
import NTTDATA.msclient.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/operation")
public class OperationController {

    @Autowired
    OperationService operationService;

    //Leer las CurrentsAccounts que tiene un cliente

    @RequestMapping("/GetCurrent/{clientId}")
    Flux<CurrentAccount> getCurrentAccounts (@PathVariable("clientId") String clientId){
        return operationService.getCurrentAccounts(clientId);
    }
}
