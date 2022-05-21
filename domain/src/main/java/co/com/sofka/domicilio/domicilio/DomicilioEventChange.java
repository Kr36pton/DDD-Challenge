package co.com.sofka.domicilio.domicilio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domicilio.domicilio.events.*;

public class DomicilioEventChange extends EventChange{
    public DomicilioEventChange(Domicilio domicilio){
        apply((DomicilioCreado event) -> {
            domicilio.cliente = event.getCliente();
            domicilio.pedido = event.getPedido();
            domicilio.valor = event.getValor();
        });

        apply((DestinoCreado event) -> {
            domicilio.destino = event.getValue();
        });
    }
}
