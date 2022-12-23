package com.entity;

@Entity
@Table(name = 'pedido')
@Getter
@Setter
@NoArgsConstructor
public class PedidoEntity {

    @Id
    @GenteratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = 'id')
    private int id;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = 'id_detalle_pedido')
    private DetallePedidoEntity detallePedido;

    @Column(name = 'nombre')
    private String nombreCliente;

    @Column(name = 'apellido_paterno')
    private String apellidoPaterno;

    @Column(name = 'apellido_materno')
    private String apellidoMaterno;

    @Column(name = 'monto_pedido')
    private double montoPedido;


}
