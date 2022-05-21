package co.com.sofka.domicilios.local;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domicilios.local.events.*;


public class LocalEventChange extends EventChange{
    public LocalEventChange(Local local, Supervisor supervisor, Empleado empleado){
        apply((LocalCreado event) -> {
            local.nombre = event.getNombre();
            local.ubicacion = event.getUbicacion();
            local.contacto = event.getContacto();
            local.supervisor = event.getSupervisor();
            local.empleado = event.getEmpleado();
        });
        apply((SupervisorActualizado event) -> {
            supervisor.nombreSupervisorEmpleado = event.getNombreSupervisorEmpleado();      
            supervisor.contactoSupervisorEmpleado = event.getContactoSupervisorEmpleado();      
            supervisor.salario = event.getSalario();      
        });
        apply((EmpleadoActualizado event) -> {
            empleado.nombreSupervisorEmpleado = event.getNombreSupervisorEmpleado();      
            empleado.contactoSupervisorEmpleado = event.getContactoSupervisorEmpleado();      
            empleado.antiguedad = event.getAntiguedad();      
        });
    }    
}
