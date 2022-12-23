package com.entity;

import java.io.Serializable;

import jakarta.persistence.Id;

@Entity
@Table(name = 'detalle_pedido')
@Getter
@Setter
@NoArgsConstructor
public class DetallePedidoEntity implements Serializable{

    public static final long serialVersionUID = ;

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "codigo_producto")
    private String codigoProducto;

    @Column(name = "costo")
    private double costo;

    @Column(name = "cantidad")
    private int cantidad;

}
