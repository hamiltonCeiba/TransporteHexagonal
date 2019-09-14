package com.ceiba.adaptador.servicio;

import com.ceiba.puerto.repositorio.RepositorioTonelaje;
import com.ceiba.servicio.ServicioCrearTonelaje;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adaptador.datastore.PeliculaDataStore;
import com.ceiba.adaptador.repositorio.RepositorioPeliculaEnMemoria;
import com.ceiba.servicio.ServicioCrearPelicula;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanServicio {

	//private RepositorioTonelaje repositorioTonelaje;
	/*@Bean
	public ServicioCrearPelicula servicioCrearPelicula() {
		System.err.println("genera servicioCrearPelicula bean");
		return new ServicioCrearPelicula(new RepositorioPeliculaEnMemoria(new PeliculaDataStore()));
	}*/

	@Bean
	@Primary
	public ServicioCrearTonelaje servicioCrearTonelaje(RepositorioTonelaje repositorioTonelaje){
		System.err.println("genera servicioCrearTonelaje bean");
		return new ServicioCrearTonelaje(repositorioTonelaje);
	}
}
//Consider defining a bean of type 'com.ceiba.servicio.ServicioCrearTonelaje'
/*
Parameter 0 of constructor in com.ceiba.comando.manejador.tonelaje.ManejadorCrearTonelaje
required a bean of type'com.ceiba.servicio.ServicioCrearTonelaje' that could not be found.

 */