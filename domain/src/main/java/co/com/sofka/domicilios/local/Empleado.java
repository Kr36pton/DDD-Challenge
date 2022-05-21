package co.com.sofka.domicilios.local;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domicilios.local.values.*;

public class Empleado extends Entity<EmpleadoId>{

    protected NombreSupervisorEmpleado nombreSupervisorEmpleado;
    protected ContactoSupervisorEmpleado contactoSupervisorEmpleado;
    protected Antiguedad antiguedad;

    public Empleado(EmpleadoId entityId, NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Antiguedad antiguedad){
        super(entityId);
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.antiguedad = antiguedad;
    }
    
    public void actualizarContacto(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Antiguedad antiguedad){
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.antiguedad = antiguedad;
    }
}
