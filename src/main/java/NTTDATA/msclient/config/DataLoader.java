package NTTDATA.msclient.config;

import NTTDATA.msclient.entity.Client;
import NTTDATA.msclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private ClientService clientService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        clientService.save(Client.builder()
                        .id("")
                        .dni("99988877")
                        .name("Roberto Benitez")
                        .phone("948948788")
                        .address("Av. los sauces")
                        .typeClient("Basic")
                        .age(29)
                .build());
    }
}
