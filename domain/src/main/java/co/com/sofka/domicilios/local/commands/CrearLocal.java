package co.com.sofka.domicilios.local.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domicilios.local.Nombre;
import co.com.sofka.domicilios.local.Ubicacion;
import co.com.sofka.domicilios.local.Contacto;
import co.com.sofka.domicilios.local.Supervisor;
import co.com.sofka.domicilios.local.Empleado;

public class CrearLocal extends Command{
    private final Nombre nombre;
    private final Ubicacion ubicacion;
    private final Contacto contacto;
    private final Supervisor supervisor;
    private final Empleado empleado;
    
    public CrearLocal(Nombre nombre, Ubicacion ubicacion, Contacto contacto, Supervisor supervisor, Empleado empleado){
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
