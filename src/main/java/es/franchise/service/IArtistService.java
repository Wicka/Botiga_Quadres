package es.franchise.service;

import java.util.List;

import es.franchise.dto.Artist;
import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

public interface IArtistService {
	public List<Artist> showArtists();
	public Artist saveArtist(Artist artist);
	public Artist artistXID(int id);
	public Artist updateArtist (Artist artist);
	public void deleteArtist(int id);
	public List<Picture> showAllPicturesXArtistXID(int id);	

}
