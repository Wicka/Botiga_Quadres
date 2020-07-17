package es.franchise.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tiendas")
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	private int id;
	
	@Column(name = "nombre")	
	private String name;
	
	@Column(name = "capacidad")
	private int capacity;
	
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param capacity		
	 */
	
	
	
	public Shop() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Shop(int id, String name, int capacity) {
	
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCapacity()=" + getCapacity() + "]";
	}

}
