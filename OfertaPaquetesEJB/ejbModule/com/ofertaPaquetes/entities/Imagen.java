package com.ofertaPaquetes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Imagenes")
public class Imagen {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idImagen;
	
	private byte[] imagen;
	
	@ManyToOne
	@JoinColumn(name="idPaquete")
	private Paquete paquete;

	
	
	public Imagen(byte[] imagen) {
		super();
		this.imagen = imagen;
	}

	public Imagen(byte[] imagen, Paquete paquete) {
		super();
		this.imagen = imagen;
		this.paquete = paquete;
	}

	public int getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	public Imagen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
