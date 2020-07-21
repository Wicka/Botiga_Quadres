package es.franchise.dto;

import java.util.List;

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
@Table (name="artists")
public class Artist {
	
	// ---------------------------------------------------------------------------------------------------
	// ---------------------------------- ATRIBUTES / FIELDS --------------------------------------------
	// ---------------------------------------------------------------------------------------------------
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	@Column(name="idartist")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@JsonIgnore	
	@OneToMany()
	@JoinColumn(name="idartist")
    private List<Picture> pictures;
	
	
	/**
	 * @param id   		-- tbl artists 	(idartist)
	 * @param name		-- tbl artists 	(name)
	 * @param pictures	-- tbl pictures (idartist)
	 */
	
	
	// -----------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------
	
	// ---------------------------------- BUILDERS ---------------------------------------------------------
	
	public Artist() {		
	}

	public Artist(int id, String name, List<Picture> pictures) {
		this.id = id;
		this.name = name;
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

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
	
	// ------------------------------------------ TO STRING ----------------------------------------------------------
	
	
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	
}
