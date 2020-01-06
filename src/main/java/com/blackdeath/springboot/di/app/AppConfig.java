package com.blackdeath.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.blackdeath.springboot.di.app.models.domain.ItemFactura;
import com.blackdeath.springboot.di.app.models.domain.Producto;
import com.blackdeath.springboot.di.app.models.services.IServicio;
import com.blackdeath.springboot.di.app.models.services.MiServicio;
import com.blackdeath.springboot.di.app.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Cámara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);

		return Arrays.asList(linea1, linea2);
	}

}
