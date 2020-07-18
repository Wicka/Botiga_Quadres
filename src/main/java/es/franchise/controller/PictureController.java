package es.franchise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.franchise.dto.Picture;
import es.franchise.dto.Shop;
import es.franchise.service.PictureServiceImp;

@RestController
@RequestMapping("/api")
public class PictureController {
	
	@Autowired
	PictureServiceImp pictureServiceImp;
	
	
	@RequestMapping ("/hola_p")
	public String hola_p(){
		return "HOLA DESDE CONTROLLER PICTURE";
	}
	
	
	@GetMapping("/pictures")
	public List<Picture> showPictures(){
		return pictureServiceImp.showPictures();
	}
	
	@GetMapping("/pictures/{id}")
	public Picture pictureXID(@PathVariable(name="id")Integer id) {
		Picture picturexid = new Picture();
		picturexid=pictureServiceImp.pictureXID(id);
		return picturexid;		
	}
	
	@PostMapping ("/pictures")
	public Picture savePicture(@RequestBody Picture picture) {
		return pictureServiceImp.savePicture(picture);			
	}
	
	@PutMapping("/pictures/{id}")
	public Picture updatPicture(@PathVariable(name="id")Integer id, @RequestBody Picture picture) {
		
		Picture picture_selected= new Picture();
			
			picture_selected=pictureServiceImp.pictureXID(id);
			
			picture_selected.setArtist(picture.getArtist());
			picture_selected.setDate(picture.getDate());
			picture_selected.setPvp(picture.getPvp());
			picture_selected.setShop(picture.getShop());
			picture_selected.setTitle(picture.getTitle());
			
		Picture picture_updated = new Picture();
		
			picture_updated=pictureServiceImp.savePicture(picture_selected);
			
		return picture_updated;		
	}
	
	@DeleteMapping ("/pictures/{id}")
	public void deletePicture(@PathVariable(name="id")Integer id) {
		
		pictureServiceImp.deletePicture(id);
	}
}
