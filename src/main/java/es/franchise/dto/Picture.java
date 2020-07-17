package es.franchise.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cuadros")
public class Picture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementa
	private int id;
	
	@Column(name="titulo")
	private String title;
	
	@Column(name="precio")
	private double pvp;
	
	@Column(name="alta")
	private Date date;
	
	@Column(name="Fk_autor")
	private int fk_author;
	
	@Column(name="Fk_tienda")
	private int fk_shop;

	public Picture(int id, String title, double pvp, Date date, int fk_author, int fk_shop) {
		super();
		this.id = id;
		this.title = title;
		this.pvp = pvp;
		this.date = date;
		this.fk_author = fk_author;
		this.fk_shop = fk_shop;
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

	public int getFk_author() {
		return fk_author;
	}

	public void setFk_author(int fk_author) {
		this.fk_author = fk_author;
	}

	public int getFk_shop() {
		return fk_shop;
	}

	public void setFk_shop(int fk_shop) {
		this.fk_shop = fk_shop;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", title=" + title + ", pvp=" + pvp + ", date=" + date + ", fk_author=" + fk_author
				+ ", fk_shop=" + fk_shop + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getPvp()="
				+ getPvp() + ", getDate()=" + getDate() + ", getFk_author()=" + getFk_author() + ", getFk_shop()="
				+ getFk_shop() + "]";
	}
	
	
	
}
