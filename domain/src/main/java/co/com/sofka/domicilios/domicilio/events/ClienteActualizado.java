package co.com.sofka.domicilios.domicilio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.domicilio.values.*;

public class ClienteActualizado extends DomainEvent {

    private final Nombre nombre;
    private final Contacto contacto;
    public ClienteActualizado(Nombre nombre, Contacto contacto) {
        super("co.com.sofka.domicilio.ClienteActualizado");
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
