package com.blackdeath.springboot.di.app.models.services;

/**
 * 
 * @author blackdeath
 *
 */
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante complicado...";
	}

}
