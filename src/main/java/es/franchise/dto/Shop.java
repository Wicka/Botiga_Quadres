package es.franchise.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="tiendas")
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	@Column(name="idtiendas")
	private int id;
	
	@Column(name = "nombre")	
	private String name;
	
	@Column(name = "capacidad")
	private int capacity;
	


	
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param capacity	
	 * @param pictures	
	 */
	
	
	
	public Shop() {
		
	}
/*	
	public Shop(int id, String name, int capacity, List<Picture> pictures, List<Artist> artists) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.pictures = pictures;
		this.artists = artists;
	}
*/
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

	


	
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
	}
	public Shop(int id, String name, int capacity) {
	
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	


}
