package com.ofertaPaquetes.jsons;

import java.util.Date;
import java.util.List;

import com.ofertaPaquetes.dtos.PaisDTO;
import com.ofertaPaquetes.dtos.PaqueteDTO;
import com.ofertaPaquetes.dtos.SolicitudDTO;

public class AgenciaJSON {
	private static final long serialVersionUID = 1L;
	private int idAgencia;
	private String nombre;
	private int idSolicitud;
	private Date fechaCreacion;
	private String estado;
	private String calle;
	private int nro;
	private String piso;
	private String depto;
	private String localidad;
	private String pais;
	
	
	
	

	public AgenciaJSON(int idAgencia, String nombre,  int idSolicitud, Date fechaCreacion,
			String estado, String calle, int nro, String piso, String depto, String localidad, String pais) {
		super();
		this.idAgencia = idAgencia;
		this.nombre = nombre;
		this.idSolicitud = idSolicitud;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		this.calle = calle;
		this.nro = nro;
		this.piso = piso;
		this.depto = depto;
		this.localidad = localidad;
		this.pais = pais;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
}
