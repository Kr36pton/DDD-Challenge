package co.com.sofka.domicilio.domicilio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domicilio.domicilio.values.*;

public class Cliente extends Entity<ClienteId> {

    protected Nombre nombre;
    protected Contacto contacto;

    public Cliente(ClienteId entityId, Nombre nombre, Contacto contacto) {
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void actualizarContacto(){
    }
}