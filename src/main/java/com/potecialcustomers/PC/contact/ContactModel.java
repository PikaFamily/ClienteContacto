package com.potecialcustomers.PC.contact;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactmodel")
public class ContactModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	private String email;
	private String llamada;
	private String visitante;
	private Date time;
	private int idCliente;

	public ContactModel(int id, String email, String llamada, String visitante, Date time, int idCliente) {
		super();
		this.id = id;
		this.email = email;
		this.llamada = llamada;
		this.visitante = visitante;
		this.time = time;
		this.idCliente = idCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLlamada() {
		return llamada;
	}

	public void setLlamada(String llamada) {
		this.llamada = llamada;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}
