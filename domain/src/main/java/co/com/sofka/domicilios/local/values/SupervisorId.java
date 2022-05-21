package co.com.sofka.domicilios.local.values;

import co.com.sofka.domain.generic.Identity;

public class SupervisorId extends Identity{

    public SupervisorId(String id){
        super(id);
    }
    public static SupervisorId of(String id){
        return new SupervisorId(id);
    }
}
