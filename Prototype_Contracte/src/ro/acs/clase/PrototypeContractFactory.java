package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeContractFactory {
    private static Map<String,AContract>  prototipuriContracte=new HashMap<>();
    static{
        ContractCorporate contractCorporate= new ContractCorporate();
        prototipuriContracte.put("corporate", contractCorporate);
        ContractParty contractParty=new ContractParty();
        prototipuriContracte.put("party", contractParty);
    }

    public static AContract getPrototipContract(String tip) throws CloneNotSupportedException {
        if(prototipuriContracte.containsKey(tip)){
            return (AContract) prototipuriContracte.get(tip).clone();
        }
        return null;
    }


}
