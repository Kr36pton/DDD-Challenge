package co.com.sofka.domicilios.domicilio;

import java.util.List;
import java.util.Objects;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.domicilio.events.*;
import co.com.sofka.domicilios.domicilio.values.*;

public class Domicilio extends AggregateEvent<DomicilioId>{
    protected DomicilioId domicilioId;
    protected Cliente cliente;
    protected Pedido pedido;
    protected Valor valor;
    protected EstadoDomicilio estadoDomicilio;
    protected Destino.Destinos destino;

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

    public EstadoDomicilio seguirDomicilio(DomicilioId domicilioId){
        var estado = this.estadoDomicilio;
        return estado;
    }

    public void asignarDestino(){
        appendChange(new DestinoCreado(Destino.Destinos.DIRECCION)).apply();
    }

    public void actualizarContacto(Nombre nombre, Contacto contacto){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(contacto);
        appendChange(new ClienteActualizado(nombre, contacto)).apply();
    }


    public Cliente Cliente() {
        return cliente;
    }

    public Pedido Pedido() {
        return pedido;
    }

    public Valor Valor() {
        return valor;
    }

    public Destino.Destinos Destino() {
        return destino;
    }
}