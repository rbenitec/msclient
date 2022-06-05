package NTTDATA.msclient.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@Getter
@Setter
public class ClientWebClient {
    /*
    private final WebClient webClient;

    public ClientWebClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://service-currentaccounts/current").build();
    }
    */
    @Bean
    public WebClient.Builder getWebClientBuilder(){
        return WebClient.builder();
    }
}
