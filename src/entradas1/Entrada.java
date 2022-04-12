package entradas1;

import java.time.LocalDateTime;

//
public class Entrada {
	
	private int numEntrada;
	private float precio;
	private String evento;
	private String nombreEvento;
	private int numAsiento;
	
	private LocalDateTime fecha;
	
	public Entrada() {
		
	}

	public Entrada(int numEntrada, float precio, String evento, String nombreEvento, int numAsiento, LocalDateTime fecha) {
		this.numEntrada = numEntrada;
		this.precio = precio;
		this.evento = evento;
		this.nombreEvento = nombreEvento;
		this.numAsiento = numAsiento;
		this.fecha = fecha;
	}

	public int getNumEntrada() {
		return numEntrada;
	}

	public void setNumEntrada(int numEntrada) {
		this.numEntrada = numEntrada;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


}
