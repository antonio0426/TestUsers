package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

@Entity
@Table(name = "DRG_USER")
public class DrgUser extends PanacheEntityBase {

	@Id
	@Column(name = "id_user")
	private Long idUser;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
