package NTTDATA.msclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document("client")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private String id;

    @NotBlank
    private String dni;

    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    private String email;

    private String phone;

    private String address;

    @NotBlank
    private String typeClient;
}
