package es.franchise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.franchise.dto.Artist;

import es.franchise.service.ArtistServiceImp;

@RestController
@RequestMapping("/api")
public class ArtistController {
	
	@Autowired
	ArtistServiceImp artistServiceImp;
	
	@RequestMapping ("/hola_a")
	public String hola_a(){
		return "HOLA DESDE CONTROLLER ARTIST";
	}
	
	
	@GetMapping("/artists")
	public List<Artist> showArtists(){
		return artistServiceImp.showArtists();
	}

}
