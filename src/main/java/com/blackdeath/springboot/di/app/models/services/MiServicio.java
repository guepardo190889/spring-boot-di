package com.blackdeath.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

/**
 * 
 * @author blackdeath
 *
 */
@Component
public class MiServicio {

	public String operacion() {
		return "Ejecutando algún proceso importante...";
	}
}
