package co.com.sofka.domicilios.domicilio.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Valor implements ValueObject<Valor.Props> {
    private final String moneda;
    private final String monto;

    public Valor(String moneda, String monto) {
        this.moneda = Objects.requireNonNull(moneda);
        this.monto = Objects.requireNonNull(monto);
        if (this.moneda.isBlank()) {
            throw new IllegalArgumentException("La moneda no puede estar en blanco");
        }
        if (this.monto.isBlank()) {
            throw new IllegalArgumentException("El monto no puede estar en blanco");
        }
        
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String moneda() {
                return moneda;
            }
            
            @Override
            public String monto() {
                return monto;
            }
        };
    }
    public interface Props {
        String moneda();
        String monto();
    }
}