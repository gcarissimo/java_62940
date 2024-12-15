package com.coderhouse.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "venta_detalle")
public class Venta_Detalle {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
		
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio_unitario")
    private BigDecimal precioUnitario;
	
	@Column(name = "subtotal")
    private BigDecimal subtotal;
	
	@ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;
	
	@ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
	
	public Venta_Detalle() {
		super();
	}
	
	public Venta_Detalle(int cantidad, BigDecimal precioUnitario, BigDecimal subtotal) {
		this();
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}
	
	public BigDecimal calcularSubtotal() {
	    return precioUnitario.multiply(new BigDecimal(cantidad));
	}

	public long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	@Override
	public String toString() {
		return "Venta_Detalle [idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + ", venta=" + venta + ", producto=" + producto + "]";
	}	
}
