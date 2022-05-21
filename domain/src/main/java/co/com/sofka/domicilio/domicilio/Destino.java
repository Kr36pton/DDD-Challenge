package co.com.sofka.domicilio.domicilio;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destino implements ValueObject<Destino.Destinos> {

    private final Destinos value;

    public Destino(Destinos value) {
        this.value = Objects.requireNonNull(value);
    }

    public enum Destinos{
        LOCAL, DIRECCION
    }

    @Override
    public Destino.Destinos value() {
        return value;
    }
}
