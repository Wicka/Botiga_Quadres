package es.franchise.service;

import java.util.List;

import es.franchise.dto.Artist;

public interface IArtistService {
	public List<Artist> showArtists();
	public Artist saveArtist(Artist artist);
	public Artist artistXID(int id);
	public Artist updateArtist (Artist artist);
	public void deleteArtist(int id);	


}
