package co.com.sofka.domicilio.domicilio.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity{
    public ClienteId(String id) {
        super(id);
    }

    public static DomicilioId of(String id) {
        return new DomicilioId(id);
    }
}
