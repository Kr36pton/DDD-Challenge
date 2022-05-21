package co.com.sofka.domicilios.local;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domicilios.local.values.*;

public class Supervisor extends Entity<SupervisorId>{
    
    protected NombreSupervisorEmpleado nombreSupervisorEmpleado;
    protected ContactoSupervisorEmpleado contactoSupervisorEmpleado;
    protected Salario salario;

    public Supervisor(SupervisorId entityId, NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Salario salario){
        super(entityId);
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.salario = salario;
    }

    public void actualizarContacto(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Salario salario){
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.salario = salario;
    }
}
