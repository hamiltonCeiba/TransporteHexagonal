package com.ceiba.comando;


public class ComandoPelicula {

	private String nombre;
	private String genero;
	private Long anioEstreno;

	public ComandoPelicula(String nombre, String genero, Long anioEstreno) {
		this.nombre = nombre;
		this.genero = genero;
		this.anioEstreno = anioEstreno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public Long getAnioEstreno() {
		return anioEstreno;
	}
}

