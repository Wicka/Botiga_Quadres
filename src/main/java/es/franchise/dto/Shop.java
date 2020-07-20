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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	@Column(name="idshop")
	private int id;
	
	@Column(name = "name")	
	private String name;
	
	@Column(name = "capacity")
	private int capacity;
	

    @OneToMany (mappedBy="shop", cascade=CascadeType.ALL)
    private List<Picture> pictures;

    
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param capacity	
	 * @param pictures	
	 */
	
	
	
	public Shop() {
		
	}
	
	//public Shop(int id, String name, int capacity) {
		public Shop(int id, String name, int capacity, List<Picture> pictures) {

			this.id = id;
			this.name = name;
			this.capacity = capacity;
			this.pictures=pictures;
		}
	
/*	public Shop(int id, String name, int capacity, List<Picture> pictures) {
	//public Shop(int id, String name, int capacity, List<Picture> pictures, List<Artist> artists) {
			
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.pictures = pictures;
	//	this.artists = artists;
	}
*/
/*	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
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
		return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity + "pictures" + pictures +  "]";
		//return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity  +  "]";
	}
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Picture")
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
	
	
	

	


}
