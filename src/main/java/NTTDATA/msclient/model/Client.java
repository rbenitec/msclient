package NTTDATA.msclient.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Date;


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

    @NotBlank
    private String lastname;

    private String email;

    private String phone;

    private String address;

    @NotBlank
    private String typeClient;

    private  int age;

}
