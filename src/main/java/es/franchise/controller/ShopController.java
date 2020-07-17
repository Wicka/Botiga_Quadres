package es.franchise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.franchise.dto.Shop;
import es.franchise.service.ShopServiceImp;

@RestController
@RequestMapping("/api")
public class ShopController {
	
	@Autowired
	ShopServiceImp shopServiceImp;
	
	@RequestMapping ("/hola")
	public String hola(){
		return "HOLA DESDE CONTROLLER SHOP";
	}
	
	@GetMapping("/shops")
	public List<Shop> showShops(){
		return shopServiceImp.showShops();
	}
	

}
