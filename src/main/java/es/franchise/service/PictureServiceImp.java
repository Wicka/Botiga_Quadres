package es.franchise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.franchise.dao.IPictureDAO;
import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

@Service
public class PictureServiceImp implements IPictureService {

	@Autowired
	IPictureDAO iPictureDao;
	
	//---------------------------------------------------------------------
	//----------------------------------------------  GET METHODS (VIEWS)
	//---------------------------------------------------------------------
					
	@Override
	public List<Picture> showPictures() {		
		return iPictureDao.findAll();
	}
	
	@Override
	public Picture pictureXID(int id) {		
		return iPictureDao.findById(id).get();
	}

	//----------------------------------------------------------------------
	//--------------------------------------------  POST METHOD  (NEW PICTURE)
	//----------------------------------------------------------------------

	@Override
	public Picture savePicture(Picture picture) {
		return iPictureDao.save(picture);
	}

	//-----------------------------------------------------------------------
	//----------------------------------  PUT METHOD (UPDATE ONE PICTURE)
	//-----------------------------------------------------------------------
		

	@Override
	public Picture updatePicture(Picture picture) {
		return iPictureDao.save(picture);
	}
	
	//--------------------------------------------------------------------
	//------------------------------------  DELETE METHOD   (DELETE SHOP BY ID)
	//----------------------CASCADE IN BBDD ------------------------------
	//--------------------------------------------------------------------

	@Override
	public void deletePicture(int id) {			
		iPictureDao.deleteById(id);
	}

}
