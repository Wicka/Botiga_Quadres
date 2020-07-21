package es.franchise.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="shops")
public class Shop {

	// ---------------------------------------------------------------------------------------------------
	// ---------------------------------- ATRIBUTES / FIELDS --------------------------------------------
	// ---------------------------------------------------------------------------------------------------

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	@Column(name="idshop")
	private int id;
	
	@Column(name = "name")	
	private String name;
	
	@Column(name = "capacity")
	private int capacity;
	
	@JsonIgnore
	@OneToMany()
	@JoinColumn(name="idshop")  
    private List<Picture> pictures;

    	
	
	/**
	 * @param id   		-- tbl shops 	(idshop)
	 * @param name		-- tbl shops 	(name)
	 * @param capacity	-- tbl shops 	(capacity)
	 * @param pictures	-- tbl pictures (idshop)
	 */
	
	
	// -----------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------
		
	// ---------------------------------- BUILDERS ---------------------------------------------------------
		
	
	public Shop() {		
	}
	
	public Shop(int id, String name, int capacity, List<Picture> pictures) {

		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.pictures=pictures;
	}
	
	// ----------------------------------------------------------------------------------------------------------------
	// --------------------------------     GETTERS     ---------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pictures")
	public List<Picture> getPictures() {
		return pictures;
	}
	

	// ----------------------------------------------------------------------------------------------------------------
	// --------------------------------     SETTERS     ---------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------

	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
		
		
	// ------------------------------------------ TO STRING ----------------------------------------------------------
	
		@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity + "pictures" + pictures +  "]";
		//return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity  +  "]";
	}
	
	
}
