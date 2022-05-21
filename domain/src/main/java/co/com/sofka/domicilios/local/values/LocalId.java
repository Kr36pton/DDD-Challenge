package co.com.sofka.domicilios.local.values;

import co.com.sofka.domain.generic.Identity;

public class LocalId extends Identity {
    public LocalId(String id){
        super(id);
    }
    public static LocalId of(String id){
        return new LocalId(id);
    }
}
