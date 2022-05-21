package co.com.sofka.domicilio.domicilio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domicilio.domicilio.values.*;

public class ActualizarCliente extends Command {
    private final Nombre nombre;
    private final Contacto contacto;

    public ActualizarCliente(Nombre nombre, Contacto contacto) {
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