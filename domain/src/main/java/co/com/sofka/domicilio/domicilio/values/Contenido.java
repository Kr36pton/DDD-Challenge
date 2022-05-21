package co.com.sofka.domicilio.domicilio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contenido implements ValueObject<Contenido.Props> {
    private final String descripcion;
    private final String cantidad;

    public Contenido(String descripcion, String cantidad) {
        this.descripcion = Objects.requireNonNull(descripcion);
        this.cantidad = Objects.requireNonNull(cantidad);
        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }
        if (this.cantidad.isBlank()) {
            throw new IllegalArgumentException("La cantidad no puede estar en blanco");
        }
        
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String descripcion() {
                return descripcion;
            }
            
            @Override
            public String cantidad() {
                return cantidad;
            }
        };
    }
    public interface Props {
        String descripcion();
        String cantidad();
    }
}