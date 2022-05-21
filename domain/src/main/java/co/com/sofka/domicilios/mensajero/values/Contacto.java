package co.com.sofka.domicilios.mensajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contacto implements ValueObject<Contacto.Props> {
    private final String direccion;
    private final String telefono;

    public Contacto(String direccion, String telefono) {
        this.direccion = Objects.requireNonNull(direccion);
        this.telefono = Objects.requireNonNull(telefono);
        if (this.direccion.isBlank()) {
            throw new IllegalArgumentException("La direccion no puede estar en blanco");
        }
    }

    @Override
    public Props value() {
        return new Props() { 

            @Override
            public String direccion() {
                return direccion;
            }

            @Override
            public String telefono() {
                return telefono;
            }
        };
    }


    public interface Props {
        String direccion();
        String telefono();
    }
}