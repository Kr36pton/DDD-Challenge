package co.com.sofka.domicilios.domicilio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.domicilio.*;
import co.com.sofka.domicilios.domicilio.values.*;

public class DomicilioCreado extends DomainEvent{
    private final Cliente cliente;
    private final Pedido pedido;
    private final Valor valor;

    public DomicilioCreado(Cliente cliente, Pedido pedido, Valor valor) {
        super("co.com.sofka.domicilios.DomicilioCreado");
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