package co.com.sofka.domicilios.local.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domicilios.local.values.*;

public class ActualizarContactoEmpleado extends Command{
    private final NombreSupervisorEmpleado nombreSupervisorEmpleado;
    private final ContactoSupervisorEmpleado contactoSupervisorEmpleado;
    private final Antiguedad antiguedad;

    public ActualizarContactoEmpleado(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Antiguedad antiguedad) {
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.antiguedad = antiguedad;
    }

    public NombreSupervisorEmpleado getNombreSupervisorEmpleado() {
        return nombreSupervisorEmpleado;
    }

    public ContactoSupervisorEmpleado getContactoSupervisorEmpleado() {
        return contactoSupervisorEmpleado;
    }
    public Antiguedad getAntiguedad() {
        return antiguedad;
    }
}
