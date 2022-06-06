package NTTDATA.msclient.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentAccount {

    private String numAccount;
    private double balance;
    private String type;         // 1: Ahorro - 2: Corrient - 3:Plazo fijo
    private int commission;
    private int clientId;
    //private int managementId;

}
