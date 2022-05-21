package co.com.sofka.domicilio.domicilio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domicilio.domicilio.*;
import co.com.sofka.domicilio.domicilio.values.*;

public class CrearDomicilio extends Command{
    private final DomicilioId domicilioId;
    private final Cliente cliente;
    private final Pedido pedido;
    private final Valor valor;

    public CrearDomicilio(DomicilioId domicilioId, Cliente cliente, Pedido pedido, Valor valor) {
        this.domicilioId = domicilioId;
        this.cliente = cliente;
        this.pedido = pedido;
        this.valor = valor;
    }

    public DomicilioId getDomicilioId(){
        return domicilioId;
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
