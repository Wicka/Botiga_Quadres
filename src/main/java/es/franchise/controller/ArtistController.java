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

import es.franchise.dto.Artist;
import es.franchise.dto.Shop;
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

	@GetMapping ("/artists/{id}")
	public Artist artistXID(@PathVariable(name="id")Integer id) {
		Artist artistxid = new Artist();
		artistxid = artistServiceImp.artistXID(id);
		return artistxid;
	}

	
	@PostMapping("/artists")
	public Artist saveShop(@RequestBody Artist artist) {
		return artistServiceImp.saveArtist(artist);
	}
	
	@PutMapping("/artists/{id}")
	public Artist updateArtist(@PathVariable(name="id")Integer id, @RequestBody Artist artist) {
		
		Artist artist_selected = new Artist();
		
			//PRIMERO LO ENCUENTRO
			artist_selected = artistServiceImp.artistXID(id);
			//AHORA ACUALIZO CON LOS DATOS DEL BODY
			artist_selected.setName(artist.getName());	
		
		Artist artist_update = new Artist();
		
			//ACTUALIZO BBDD
			artist_update = artistServiceImp.updateArtist(artist_selected);
			
		
		return artist_update;
	}
	
	@DeleteMapping("/artists/{id}")
	public void deleteArtist(@PathVariable(name="id") Integer id) {
		artistServiceImp.deleteArtist(id);		
	}
}
