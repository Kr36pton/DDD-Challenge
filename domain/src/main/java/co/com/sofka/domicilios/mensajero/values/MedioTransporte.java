package co.com.sofka.domicilios.mensajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MedioTransporte implements ValueObject<MedioTransporte.Props> {
    private final String tipo;
    private final String marca;

    public MedioTransporte(String tipo, String marca) {
        this.tipo = Objects.requireNonNull(tipo);
        this.marca = Objects.requireNonNull(marca);
        if (this.tipo.isBlank()) {
            throw new IllegalArgumentException("El tipo no puede estar en blanco");
        }
        if (this.marca.isBlank()) {
            throw new IllegalArgumentException("La marca no puede estar en blanco");
        }
        
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipo() {
                return tipo;
            }
            
            @Override
            public String marca() {
                return marca;
            }
        };
    }
    public interface Props {
        String tipo();
        String marca();
    }
}