package es.franchise.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="pictures")
public class Picture {

	// ---------------------------------------------------------------------------------------------------
	// ---------------------------------- ATRIBUTES / FIELDS --------------------------------------------
	// ---------------------------------------------------------------------------------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	@Column(name="idpicture")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="pvp")
	private double pvp;
	
	@Column(name="date")
	private Date date;
	
	@ManyToOne
    @JoinColumn(name="idartist")
	private Artist artist;
	
	@ManyToOne
    @JoinColumn(name="idshop")
    private Shop shop;
	

	/**
	 * @param id   		-- tbl pictures 	(idpicture)
	 * @param title		-- tbl pictures 	(title)
	 * @param pvp		-- tbl pictures 	(pvp)
	 * @param date		-- tbl pictures 	(date)
	 * @param artits	-- tbl artist		(idartist)
	 * @param shop		-- tbl shop			(idshop)
	 */
	

	// -----------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------
		
	// ---------------------------------- BUILDERS ---------------------------------------------------------

	
	public Picture() {	
	}
	
	public Picture(int id, String title, double pvp, Date date, Artist artist, Shop shop) {
		super();
		this.id = id;
		this.title = title;
		this.pvp = pvp;
		this.date = date;
		this.artist = artist;
		this.shop = shop;
	}
	
	
	// ----------------------------------------------------------------------------------------------------------------
	// --------------------------------     GETTERS     ---------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------

	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public double getPvp() {
		return pvp;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Artist getArtist() {
		return artist;
	}

	public Shop getShop() {
		return shop;
	}
	
	
	// ----------------------------------------------------------------------------------------------------------------
	// --------------------------------     SETTERS     ---------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------

	
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}


	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
	// ------------------------------------------ TO STRING ----------------------------------------------------------
	

	@Override
	public String toString() {
		return "Picture [id=" + id + ", title=" + title + ", pvp=" + pvp + ", date=" + date + ", artist=" + artist
				+ ", shop=" + shop + "]";
	}

	

	
}
