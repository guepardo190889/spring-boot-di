package com.blackdeath.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

/**
 * 
 * @author blackdeath
 *
 */
@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante complicado...";
	}

}
