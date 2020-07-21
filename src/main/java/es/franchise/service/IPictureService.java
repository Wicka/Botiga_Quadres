package es.franchise.service;

import java.util.List;

import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

public interface IPictureService {
	
	public List<Picture> showPictures();
	public Picture savePicture(Picture picture);
	public Picture pictureXID(int id);
	public Picture updatePicture (Picture picture);
	public void deletePicture(int id);

}
