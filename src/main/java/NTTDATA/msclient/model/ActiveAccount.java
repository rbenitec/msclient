package NTTDATA.msclient.model;

import NTTDATA.msclient.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveAccount {

    private String numAccount;
    private String type; //1: personal 2 : empresrial
    private int limit;
    private String clientId;
}
