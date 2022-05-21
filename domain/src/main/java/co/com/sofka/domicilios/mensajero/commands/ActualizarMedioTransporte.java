package co.com.sofka.domicilios.mensajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domicilios.mensajero.values.*;

public class ActualizarMedioTransporte extends Command {
    private final MedioTransporte medioTransporte;

    public ActualizarMedioTransporte(MedioTransporte mediotransporte) {
        this.medioTransporte = mediotransporte;
    }

    public MedioTransporte getMedioTransporte() {
        return medioTransporte;
    }

}