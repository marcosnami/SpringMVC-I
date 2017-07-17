package com.alura.springmvc1.model;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * Created by MarcosNami on 7/16/2017.
 */
@Embeddable
public class Preco {

    private BigDecimal valor;
    private TipoPreco tipo;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoPreco getTipo() {
        return tipo;
    }

    public void setTipo(TipoPreco tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Preco{" +
                "valor=" + valor +
                ", tipo=" + tipo +
                '}';
    }
}
