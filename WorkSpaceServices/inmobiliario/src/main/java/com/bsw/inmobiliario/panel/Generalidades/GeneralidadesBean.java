package com.bsw.inmobiliario.panel.Generalidades;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size; 
import org.hibernate.validator.constraints.Email;
import com.bsw.inmobiliario.panel.Constructora.Constructora;

public class GeneralidadesBean implements Serializable{

	@Valid
	@NotNull(message= "{GeneralidadesBean.constructoras.InvalidNotNullConstructoras}")
	private List<Constructora> constructoras;

	@NotNull(message="{GeneralidadesBean.numeroUnidades.InvalidNotNullNumeroUnidades}")
	//@Size(min=1, max=38, message="{GeneralidadesBean.numeroUnidades.InvalidSizeNumeroUnidades}")
	private int numeroUnidades;

	@NotNull(message="{GeneralidadesBean.numeroParqueos.InvalidNotNullNumeroParqueos}")
	//@Size(min=1, max=38, message="{GeneralidadesBean.numeroParqueos.InvalidSizeNumeroParqueos}")
	private int numeroParqueos;

	@NotNull(message="{GeneralidadesBean.numeroCuartosUtiles.InvalidNotNullNumeroCuartosUtiles}")
	//@Size(min=1, max=38, message="{GeneralidadesBean.numeroCuartosUtiles.InvalidSizeNumeroCuartosUtile}")
	private int numeroCuartosUtiles;

	@Size(min=1, max=100, message="{GeneralidadesBean.direccion.InvalidSizeDireccion}")
	@Pattern(regexp="[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}", message="{GeneralidadesBean.direccion.InvalidPatternDireccion}")
	private String direccion;

	//@Size(min=1, max=20, message="{GeneralidadesBean.telefonoFijo.InvalidSizeTelefonoFijo}")
	//@Pattern(regexp="[0-9]+", message="{GeneralidadesBean.telefonoFijo.InvalidPatternTelefonoFijo}")
	private int telefonoFijo;

	//@Size(min=1, max=20, message="{GeneralidadesBean.telefonoMovil.InvalidSizeTelefonoMovil}")
	//@Pattern(regexp="[0-9]+", message="{GeneralidadesBean.telefonoMovil.InvalidPatternTelefonoMovil}")
	private int telefonoMovil;

	@Email(message = "{GeneralidadesBean.email.InvalidEmail}")
	private String email;

	@Valid
	private List<Ciudades> ciudad;

	@Size(min=1, max=4000, message="{GeneralidadesBean.descripcion.InvalidSizeDescripcion}")
	@Pattern(regexp= "[a-zA-Z0-9-]+", message="{GeneralidadesBean.descripcion.InvalidPatternDescripcion}")
	private String descripcion;

	@Size(min=1, max=4000, message="{GeneralidadesBean.zonasEntradas.InvalidSizeZonasEntradas}")
	@Pattern(regexp= "[a-zA-Z0-9-]+", message="{GeneralidadesBean.zonasEntradas.InvalidPatternZonasEntradas}")
	private String zonasEntradas;

	@Size(min=1, max=4000, message="{GeneralidadesBean.zonasCercanas.InvalidSizeZonasCercanas}")
	@Pattern(regexp= "[a-zA-Z0-9-]+", message="{GeneralidadesBean.zonasCercanas.InvalidPatternZonasCercanas}")
	private String zonasCercanas;

	//Getters and Setters

	public List<Constructora> getConstructoras() {
		return constructoras;
	}

	public void setConstructoras(List<Constructora> constructoras) {
		this.constructoras = constructoras;
	}

	public int getNumeroUnidades() {
		return numeroUnidades;
	}

	public void setNumeroUnidades(int numeroUnidades) {
		this.numeroUnidades = numeroUnidades;
	}

	public int getNumeroParqueos() {
		return numeroParqueos;
	}

	public void setNumeroParqueos(int numeroParqueos) {
		this.numeroParqueos = numeroParqueos;
	}

	public int getNumeroCuartosUtiles() {
		return numeroCuartosUtiles;
	}

	public void setNumeroCuartosUtiles(int numeroCuartosUtiles) {
		this.numeroCuartosUtiles = numeroCuartosUtiles;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(int telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public int getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(int telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Ciudades> getCiudad() {
		return ciudad;
	}

	public void setCiudad(List<Ciudades> ciudad) {
		this.ciudad = ciudad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getZonasEntradas() {
		return zonasEntradas;
	}

	public void setZonasEntradas(String zonasEntradas) {
		this.zonasEntradas = zonasEntradas;
	}

	public String getZonasCercanas() {
		return zonasCercanas;
	}

	public void setZonasCercanas(String zonasCercanas) {
		this.zonasCercanas = zonasCercanas;
	}


}
