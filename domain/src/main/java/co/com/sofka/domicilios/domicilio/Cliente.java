package co.com.sofka.domicilios.domicilio;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domicilios.domicilio.values.*;

public class Cliente extends Entity<ClienteId> {

    protected Nombre nombre;
    protected Contacto contacto;

    public Cliente(ClienteId entityId, Nombre nombre, Contacto contacto) {
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void actualizarContacto(Nombre nombre, Contacto contacto) {
        this.nombre = Objects.requireNonNull(nombre);
        this.contacto = Objects.requireNonNull(contacto);
    }
}