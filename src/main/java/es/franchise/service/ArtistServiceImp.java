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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artist artistXID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artist updateArtist(Artist artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArtist(int id) {
		// TODO Auto-generated method stub

	}

}
