package co.com.sofka.domicilio.domicilio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domicilio.domicilio.values.*;

public class Domicilio extends AggregateEvent{
    public Domicilio(DomicilioId entityId){
        super(entityId);
    }
}
