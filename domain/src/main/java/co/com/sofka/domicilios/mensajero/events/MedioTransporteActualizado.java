package co.com.sofka.domicilios.mensajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.mensajero.values.*;

public class MedioTransporteActualizado extends DomainEvent {

    private final MedioTransporte mediotransporte;

    public MedioTransporteActualizado(MedioTransporte mediotransporte) {
        super("co.com.sofka.domicilio.MedioTransporteActualizado");
        this.mediotransporte = mediotransporte;
    }

    public MedioTransporte getMedioTransporte() {
        return mediotransporte;
    }


}
