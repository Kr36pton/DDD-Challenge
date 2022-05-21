package co.com.sofka.domicilio.domicilio;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilio.domicilio.values.*;
import co.com.sofka.domicilio.domicilio.events.*;

public class Domicilio extends AggregateEvent<DomicilioId>{
    protected DomicilioId domicilioId;
    protected Cliente cliente;
    protected Pedido pedido;
    protected Valor valor;

    public Domicilio(DomicilioId entityId, DomicilioId domicilioId, Cliente cliente, Pedido pedido, Valor valor) {
        super(entityId);
        appendChange(new DomicilioCreado(cliente, pedido, valor)).apply();
        subscribe(new DomicilioEventChange(this));
    }

    private Domicilio(DomicilioId entityId){
        super(entityId);
        subscribe(new DomicilioEventChange(this));
    }

    public static Domicilio from(DomicilioId entityId, List<DomainEvent> events){
        var domicilio = new Domicilio(entityId);
        events.forEach(domicilio::applyEvent);
        return domicilio;
    }
}