package co.com.sofka.domicilios.local.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.local.values.*;

public class EmpleadoActualizado extends DomainEvent{

    private final NombreSupervisorEmpleado nombreSupervisorEmpleado;
    private final ContactoSupervisorEmpleado contactoSupervisorEmpleado;
    private final Antiguedad antiguedad;

    public EmpleadoActualizado(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Antiguedad antiguedad){
        super("co.com.sofka.domicilios.EmpleadoActualizado");
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.antiguedad = antiguedad;
    }

    public NombreSupervisorEmpleado getNombreSupervisorEmpleado(){
        return nombreSupervisorEmpleado;
    }
    public ContactoSupervisorEmpleado getContactoSupervisorEmpleado(){
        return contactoSupervisorEmpleado;
    }
    public Antiguedad getAntiguedad(){
        return antiguedad;
    }
}
