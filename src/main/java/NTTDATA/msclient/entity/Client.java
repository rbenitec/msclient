package NTTDATA.msclient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.NotBlank;
import java.util.ArrayList;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "client")
public class Client {

    @Id
    private String id;

    @NotBlank
    private String dni;

    @NotBlank
    private String name;
    private String phone;
    private String address;

    @NotBlank
    private String typeClient;
    private  int age;

}
