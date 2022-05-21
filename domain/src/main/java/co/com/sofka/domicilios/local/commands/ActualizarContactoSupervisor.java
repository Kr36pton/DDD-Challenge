package co.com.sofka.domicilios.local.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domicilios.local.values.*;

public class ActualizarContactoSupervisor extends Command{
    private final NombreSupervisorEmpleado nombreSupervisorEmpleado;
    private final ContactoSupervisorEmpleado contactoSupervisorEmpleado;
    private final Salario salario;

    public ActualizarContactoSupervisor(NombreSupervisorEmpleado nombreSupervisorEmpleado, ContactoSupervisorEmpleado contactoSupervisorEmpleado, Salario salario) {
        this.nombreSupervisorEmpleado = nombreSupervisorEmpleado;
        this.contactoSupervisorEmpleado = contactoSupervisorEmpleado;
        this.salario = salario;
    }

    public NombreSupervisorEmpleado getNombreSupervisorEmpleado() {
        return nombreSupervisorEmpleado;
    }

    public ContactoSupervisorEmpleado getContactoSupervisorEmpleado() {
        return contactoSupervisorEmpleado;
    }
    public Salario getSalario() {
        return salario;
    }
}
