package co.com.sofka.domicilio.domicilio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilio.domicilio.values.*;
import co.com.sofka.domicilio.domicilio.*;

public class DomicilioCreado extends DomainEvent{
    private final Cliente cliente;
    private final Pedido pedido;
    private final Valor valor;

    public DomicilioCreado(Cliente cliente, Pedido pedido, Valor valor) {
        super("co.com.sofka.transporte.DomicilioCreado");
        this.cliente = cliente;
        this.pedido = pedido;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Valor getValor() {
        return valor;
    }
}