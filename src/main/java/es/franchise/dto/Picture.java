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

@Entity
@Table (name="pictures")
public class Picture {

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
	

	public Picture(int id, String title, double pvp, Date date, Artist artist, Shop shop) {
		super();
		this.id = id;
		this.title = title;
		this.pvp = pvp;
		this.date = date;
		this.artist = artist;
		this.shop = shop;
	}
	
	public Picture() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", title=" + title + ", pvp=" + pvp + ", date=" + date + ", artist=" + artist
				+ ", shop=" + shop + "]";
	}

	

	
}
