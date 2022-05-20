package co.com.sofka.domicilio.domicilio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domicilio.domicilio.values.*;

public class Domicilio extends AggregateEvent{
    protected final DomicilioId domicilioId;
    protected final Cliente cliente;
    protected final Pedido pedido;
    protected final Valor valor;

    public Domicilio(DomicilioId entityId, DomicilioId domicilioId, Cliente cliente, Pedido pedido, Valor valor) {
        super(entityId);
        this.domicilioId = domicilioId;
        this.cliente = cliente;
        this.pedido = pedido;
        this.valor = valor;
    }
}