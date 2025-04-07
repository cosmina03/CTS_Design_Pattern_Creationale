package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class DronaConexiuni {
    private static Map<String, IServiceConnection> registry=null;
    public static final String BASE="baseControl";
    public static final String SATELIT="satelit";
    public static final String SERVICIU="serviciu";

    static{
        registry=new HashMap<>();
        registry.put(BASE, new BaseControl());
        registry.put(SATELIT,new SatelitGPS());
        registry.put(SERVICIU,new ServiciuWeb());
    }

    public IServiceConnection getSingleton(String key){
        if(registry.containsKey(key)){
            return registry.get(key);
        }else{
            throw new IllegalArgumentException();
        }
    }






}
