package co.com.sofka.domicilios.local.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domicilios.local.Contacto;
import co.com.sofka.domicilios.local.Supervisor;
import co.com.sofka.domicilios.local.Nombre;
import co.com.sofka.domicilios.local.Empleado;
import co.com.sofka.domicilios.local.Ubicacion;


public class LocalCreado extends DomainEvent{
    private final Nombre nombre;
    private final Ubicacion ubicacion;
    private final Contacto contacto;
    private final Supervisor supervisor;
    private final Empleado empleado;

    public LocalCreado(Nombre nombre, Ubicacion ubicacion, Contacto contacto, Supervisor supervisor, Empleado empleado){
        super("co.com.sofka.domicilios.LocalCreado");
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.contacto = contacto;
        this.supervisor = supervisor;
        this.empleado = empleado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
