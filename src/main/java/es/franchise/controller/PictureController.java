package es.franchise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
