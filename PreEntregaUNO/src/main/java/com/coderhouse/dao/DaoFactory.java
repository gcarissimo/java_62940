package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;
import com.coderhouse.models.Venta_Detalle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public Cliente persistirCliente(Cliente cliente) {
		em.persist(cliente);
		return cliente;
	}
	
	@Transactional
	public Producto persistirProdcuto(Producto producto) {
		em.persist(producto);
		return producto;
	}
	
	@Transactional
    public Venta persistirVenta(Venta venta) {
        // Asegurarse de que los detalles tengan referencia a la venta
        for (Venta_Detalle detalle : venta.getDetalles()) {
            detalle.setVenta(venta);
        }
        em.persist(venta);
        return venta;
    }

	
	@Transactional
	public void persistirVentaDetalle(Venta_Detalle ventaDetalle) {
		em.persist(ventaDetalle);
	}
	
}
