package es.franchise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.franchise.dao.IArtistDAO;
import es.franchise.dao.IPictureDAO;
import es.franchise.dto.Artist;
import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

@Service
public class ArtistServiceImp implements IArtistService {

	@Autowired
	IArtistDAO iArtistDao;
	

		
	//---------------------------------------------------------------------
	//----------------------------------------------  GET METHODS (VIEWS)
	//---------------------------------------------------------------------

	@Override
	public List<Artist> showArtists() {		
		return iArtistDao.findAll() ;
	}
	
	@Override
	public Artist artistXID(int id) {		
		return iArtistDao.findById(id).get();
	}
	
	@Override
	public List<Picture> showAllPicturesXArtistXID(int id) {		
		return iArtistDao.findById(id).get().getPictures();
	}
	
	//----------------------------------------------------------------------
	//--------------------------------------------  POST METHOD  (NEW ARTIST)
	//----------------------------------------------------------------------

	@Override
	public Artist saveArtist(Artist artist) {		
		return iArtistDao.save(artist);
	}

	//-----------------------------------------------------------------------
	//----------------------------------  PUT METHOD (UPDATE ONE ARTIST)
	//-----------------------------------------------------------------------
	

	@Override
	public Artist updateArtist(Artist artist) {		
		return iArtistDao.save(artist);
	}

	//--------------------------------------------------------------------
	//------------------------------------  DELETE METHOD   (DELETE ARTIST BY ID)
	//----------------------CASCADE IN BBDD ------------------------------
	//--------------------------------------------------------------------

	@Override
	public void deleteArtist(int id) {		
		iArtistDao.deleteById(id);

	}

	

	

}
