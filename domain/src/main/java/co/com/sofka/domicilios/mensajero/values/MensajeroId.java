package co.com.sofka.domicilios.mensajero.values;

import co.com.sofka.domain.generic.Identity;

public class MensajeroId extends Identity{
    public MensajeroId(String id) {
        super(id);
    }

    public static MensajeroId of(String id) {
        return new MensajeroId(id);
    }
}
