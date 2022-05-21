package co.com.sofka.domicilios.mensajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.mensajero.values.*;

public class MensajeroCreado extends DomainEvent{
    private final Nombre nombre;
    private final Contacto contacto;
    private final MedioTransporte mediotransporte;

    public MensajeroCreado(Nombre nombre, Contacto contacto, MedioTransporte mediotransporte) {
        super("co.com.sofka.domicilios.MensajeroCreado");
        this.nombre = nombre;
        this.contacto = contacto;
        this.mediotransporte = mediotransporte;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public MedioTransporte getMedioTransporte() {
        return mediotransporte;
    }
}