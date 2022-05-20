package co.com.sofka.domicilio.domicilio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contenido implements ValueObject<Contenido.Props> {
    private final String descripcion;

    public Contenido(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }
        
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String descripcion() {
                return descripcion;
            }

        };
    }
    public interface Props {
        String descripcion();
    }
}