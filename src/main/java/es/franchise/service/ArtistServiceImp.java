package es.franchise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.franchise.dao.IArtistDAO;
import es.franchise.dao.IPictureDAO;
import es.franchise.dto.Artist;

@Service
public class ArtistServiceImp implements IArtistService {

	@Autowired
	IArtistDAO iArtistDao;
	
	@Override
	public List<Artist> showArtists() {
		
		return iArtistDao.findAll() ;
	}

	@Override
	public Artist saveArtist(Artist artist) {
		
		return iArtistDao.save(artist);
	}

	@Override
	public Artist artistXID(int id) {
		
		return iArtistDao.findById(id).get();
	}

	@Override
	public Artist updateArtist(Artist artist) {
		
		return iArtistDao.save(artist);
	}

	@Override
	public void deleteArtist(int id) {
		iArtistDao.deleteById(id);

	}

}
