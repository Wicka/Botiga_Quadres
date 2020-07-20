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
	
	@Override
	public List<Picture> showPictures() {
		
		return iPictureDao.findAll();
	}

	@Override
	public Picture savePicture(Picture picture) {
		return iPictureDao.save(picture);
	}

	@Override
	public Picture pictureXID(int id) {		
		return iPictureDao.findById(id).get();
	}

	@Override
	public Picture updatePicture(Picture picture) {
		return iPictureDao.save(picture);
	}

	@Override
	public void deletePicture(int id) {		
	
		iPictureDao.deleteById(id);
	}

	@Override	
	public boolean pictureXShop(Shop shop) {
		Boolean exist=true;
		//BUSCAR EN TABLA PICTURES SI EXISTE SHOP EN EL CAMPO idtiendas
		
	//	iPictureDao.exists(shop.getId());
		return exist;
	}

	@Override
	public void deleteAllPicture() {
		iPictureDao.deleteAll();
		
	}





}
