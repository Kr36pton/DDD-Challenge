package co.com.sofka.domicilios.local.events;

import co.com.sofka.domicilios.local.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class SupervisorActualizado extends DomainEvent{
    private final NombreSupervisorEmpleado nombreSupervisorEmpleado;
    private final ContactoSupervisorEmpleado contactoSupervisorEmpleado;
    private final Salario salario;

    public SupervisorActualizado(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Salario salario){
        super("co.com.sofka.domicilios.SupervisorActualizado");
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.salario = salario;
    }

    public NombreSupervisorEmpleado getNombreSupervisorEmpleado(){
        return nombreSupervisorEmpleado;
    }
    public ContactoSupervisorEmpleado getContactoSupervisorEmpleado(){
        return contactoSupervisorEmpleado;
    }
    public Salario getSalario(){
        return salario;
    }
}
