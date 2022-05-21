package co.com.sofka.domicilios.local;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.local.events.*;
import co.com.sofka.domicilios.local.values.*;

import java.util.List;

public class Local extends AggregateEvent<LocalId> {

    protected LocalId localId;
    protected Nombre nombre;
    protected Ubicacion ubicacion;
    protected Contacto contacto;
    protected Supervisor supervisor;
    protected Empleado empleado;

    public Local(LocalId entityId, LocalId localId, Nombre nombre, Ubicacion ubicacion, Contacto contacto, Supervisor supervisor, Empleado empleado){
        super(entityId);
        appendChange(new LocalCreado(nombre, ubicacion, contacto, supervisor, empleado)).apply();
        subscribe(new LocalEventChange(this, supervisor, empleado));
    }
    private Local(LocalId entityId){
        super(entityId);
        subscribe(new LocalEventChange(this, supervisor, empleado));
    }
    public static Local from(LocalId entityId, List<DomainEvent> events){
        var local = new  Local(entityId);
        events.forEach(local::applyEvent);
        return local;
    }
    public void actualizarContactoSupervisor(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Salario salario){
        appendChange(new SupervisorActualizado(nombreSupervisorEmpleado, contactoSupervisorEmpleado, salario)).apply();
    }

    public void actualizarContactoEmpleado(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Antiguedad antiguedad){
        appendChange(new EmpleadoActualizado(nombreSupervisorEmpleado, contactoSupervisorEmpleado, antiguedad)).apply();
    }
}
