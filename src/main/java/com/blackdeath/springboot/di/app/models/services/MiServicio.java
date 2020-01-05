package com.blackdeath.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

/**
 * 
 * @author blackdeath
 *
 */
@Component("miServicioSimple")
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante...";
	}

}
