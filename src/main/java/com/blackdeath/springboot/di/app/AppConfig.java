package com.blackdeath.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

}
