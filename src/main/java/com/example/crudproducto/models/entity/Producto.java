package com.example.crudproducto.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String marcaReferencia;
    private String nombre;
    private String qr;

    public Producto() {

    }

/*    public Producto(int id, String marcaReferencia, String nombre, String qr) {
        super();
        this.id = id;
        this.marcaReferencia = marcaReferencia;
        this.nombre = nombre;
        this.qr = qr;
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarcaReferencia() {
        return marcaReferencia;
    }

    public void setMarcaReferencia(String marcaReferencia) {
        this.marcaReferencia = marcaReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

}
