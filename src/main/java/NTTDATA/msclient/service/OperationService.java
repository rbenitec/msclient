package NTTDATA.msclient.service;

import NTTDATA.msclient.model.CurrentAccount;
import reactor.core.publisher.Flux;

public interface OperationService {

    //Obtener las CurrentAccount de los clientes
    Flux<CurrentAccount> getCurrentAccounts(int clientId);


    //Asignar cuentas a los clientes
    //Consulta las cuentas del cliente
    //Actualiza la cuenta de un cliente
    //Elimina cuenta de un cliente.
}
