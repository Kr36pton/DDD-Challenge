package co.com.sofka.domicilio.domicilio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domicilio.domicilio.values.*;

public class Pedido extends Entity<PedidoId> {

    protected Contenido contenido;
    protected Valor valor;

    public Pedido(PedidoId entityId, Contenido contenido, Valor valor) {
        super(entityId);
        this.contenido = contenido;
        this.valor = valor;
    }

    public void actualizarDatos( Contenido contenido, Valor valor){
        this.valor = valor;
        this.contenido = contenido;
    }

}
