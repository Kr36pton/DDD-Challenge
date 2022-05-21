package co.com.sofka.domicilio.domicilio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilio.domicilio.*;

public class DestinoCreado extends DomainEvent {

    private final Destino.Destinos value;
    public DestinoCreado(Destino.Destinos value) {
        super("co.com.sofka.domicilio.domicilio.DestinoCreado");
        this.value = value;
    }

    public enum Destinos{
        OFICINA, DIRECCION
    }

    public Destino.Destinos getValue() {
        return value;
    }
}
