package co.com.sofka.domicilios.mensajero;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domicilios.mensajero.events.*;;

public class MensajeroEventChange extends EventChange{
    public MensajeroEventChange(Mensajero mensajero){
        apply((MensajeroCreado event) -> {
            mensajero.nombre = event.getNombre();
            mensajero.contacto = event.getContacto();
            mensajero.medioTransporte = event.getMedioTransporte();
        });
    }
}