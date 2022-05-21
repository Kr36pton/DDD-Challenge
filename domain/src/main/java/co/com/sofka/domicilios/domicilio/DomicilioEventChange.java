package co.com.sofka.domicilios.domicilio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domicilios.domicilio.events.*;

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
        apply((ClienteActualizado event) -> {
            domicilio.cliente.nombre = event.getNombre();
            domicilio.cliente.contacto = event.getContacto();
        });
    }
}
