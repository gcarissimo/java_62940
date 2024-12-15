package com.coderhouse;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;
import com.coderhouse.models.Venta_Detalle;

@SpringBootApplication
public class PreEntregaUnoApplication implements CommandLineRunner {
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(PreEntregaUnoApplication.class, args);
	}
	public void run(String... args) throws Exception {

		try {
			
			Cliente cliente1 = new Cliente("Andrea", "Ortuño", "andrea_ortuno@mail.com");
			Cliente cliente2 = new Cliente("Catalina", "Carissimo", "catalina_carissimo@mail.com");
			Cliente cliente3 = new Cliente("Gianlucca", "Carissimo", "gianlucca_carissimo@mail.com");
			Cliente cliente4 = new Cliente("Esteban", "Quito", "esteban_quito@mail.com");
			Cliente cliente5 = new Cliente("Elsa", "Ramirez", "elsa_ramirez@mail.com");
			Cliente cliente6 = new Cliente("Ramón", "Gonzalez", "ramon_gonzalez@mail.com");
			
			Producto product1 = new Producto("IPhone", "IPhone 16 ProMax", new BigDecimal(999));
			Producto product2 = new Producto("IPhone", "IPhone 16 Plus", new BigDecimal(799));
			Producto product3 = new Producto("IPhone", "IPhone 15", new BigDecimal(699));
			Producto product4 = new Producto("Power Adapter", "20W USB-C Power Adapter", new BigDecimal(19));
			Producto product5 = new Producto("Power Adapter", "30W USB-C Power Adapter", new BigDecimal(39));
			Producto product6 = new Producto("AirPods", "AirPods MAX", new BigDecimal(549));

			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);	
			dao.persistirCliente(cliente3);	
			dao.persistirCliente(cliente4);	
			dao.persistirCliente(cliente5);	
			dao.persistirCliente(cliente6);	
			
			dao.persistirProdcuto(product1);
			dao.persistirProdcuto(product2);
			dao.persistirProdcuto(product3);
			dao.persistirProdcuto(product4);
			dao.persistirProdcuto(product5);
			dao.persistirProdcuto(product6);
			
			
			Venta venta1 = new Venta();
            venta1.setCliente(cliente1);
            venta1.setFechaVenta(LocalDateTime.now());
			
            Venta_Detalle detalle1 = new Venta_Detalle();
            detalle1.setProducto(product1);
            detalle1.setCantidad(1);
            detalle1.setPrecioUnitario(product1.getPrecio());
            detalle1.setVenta(venta1);
			
            
            Venta_Detalle detalle2 = new Venta_Detalle();
            detalle2.setProducto(product4);
            detalle2.setCantidad(1);
            detalle2.setPrecioUnitario(product4.getPrecio());
            detalle2.setVenta(venta1);
			
            venta1.getDetalles().add(detalle1);
            venta1.getDetalles().add(detalle2);
            
            venta1.calcularTotal();
            dao.persistirVenta(venta1);
            
            System.out.println("\n\n\n\n");
            System.out.println("Venta 1 creada con éxito.");
            System.out.println("\n\n\n\n");
            
            Venta venta2 = new Venta();
            venta2.setCliente(cliente3);
            venta2.setFechaVenta(LocalDateTime.now());
			
            Venta_Detalle detalle3 = new Venta_Detalle();
            detalle3.setProducto(product3);
            detalle3.setCantidad(1);
            detalle3.setPrecioUnitario(product3.getPrecio());
            detalle3.setVenta(venta2);
			
            
            Venta_Detalle detalle4 = new Venta_Detalle();
            detalle4.setProducto(product6);
            detalle4.setCantidad(1);
            detalle4.setPrecioUnitario(product6.getPrecio());
            detalle4.setVenta(venta2);
			
            venta2.getDetalles().add(detalle3);
            venta2.getDetalles().add(detalle4);
            
            venta2.calcularTotal();
            dao.persistirVenta(venta2);
            
            System.out.println("\n\n\n\n");
            System.out.println("Venta 1 creada con éxito.");
            System.out.println("\n\n");
            System.out.println("Venta 2 creada con éxito.");
            System.out.println("\n\n\n\n");
       
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}	
	
	
	
}
