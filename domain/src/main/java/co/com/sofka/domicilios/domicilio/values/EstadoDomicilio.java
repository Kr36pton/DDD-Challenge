package co.com.sofka.domicilios.domicilio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoDomicilio implements ValueObject<EstadoDomicilio.Estados> {

    private final Estados value;

    public EstadoDomicilio(Estados value) {
        this.value = Objects.requireNonNull(value);
    }

    public enum Estados{
        ADMITIDO, ENBODEGA, ENTRANSITO, ENTREGADO
    }

    @Override
    public EstadoDomicilio.Estados value() {
        return value;
    }
}
