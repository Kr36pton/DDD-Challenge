package co.com.sofka.domicilios.mensajero;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.mensajero.events.*;
import co.com.sofka.domicilios.mensajero.values.*;

public class Mensajero extends AggregateEvent<MensajeroId>{
    protected MensajeroId mensajeroId;
    protected Nombre nombre;
    protected Contacto contacto;
    protected MedioTransporte medioTransporte;

    public Mensajero(MensajeroId entityId, MensajeroId mensajeroId, Nombre nombre, Contacto contacto, MedioTransporte medioTransporte) {
        super(entityId);
        appendChange(new MensajeroCreado(nombre, contacto, medioTransporte)).apply();
        subscribe(new MensajeroEventChange(this));
    }

    private Mensajero(MensajeroId entityId){
        super(entityId);
        subscribe(new MensajeroEventChange(this));
    }

    public static Mensajero from(MensajeroId entityId, List<DomainEvent> events){
        var mensajero = new Mensajero(entityId);
        events.forEach(mensajero::applyEvent);
        return mensajero;
    }


    public Nombre Nombre() {
        return nombre;
    }

    public Contacto Contacto() {
        return contacto;
    }

    public MedioTransporte MedioTransporte() {
        return medioTransporte;
    }

}