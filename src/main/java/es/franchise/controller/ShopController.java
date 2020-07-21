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
import es.franchise.service.ShopServiceImp;

@RestController
@RequestMapping("/api")
public class ShopController {
	
	@Autowired
	ShopServiceImp shopServiceImp;
	
	//--------------------------------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------  CALL TO METHODS
	//--------------------------------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------------------------

	
	
	//---------------------------------------------------------------------
	//----------------------------------------------  GET METHODS (VIEWS)
	//---------------------------------------------------------------------
	
	@GetMapping("/shops")
	public List<Shop> showShops(){
		return shopServiceImp.showShops();
	}
	
	
	@GetMapping("/shops/{id}")
	public Shop shopXID(@PathVariable(name="id")Integer id) {
		Shop shopxid = new Shop();
		shopxid=shopServiceImp.shopXID(id);
		return shopxid;		
	}
	
	@GetMapping("/shops/{id}/pictures")
	public List<Picture> showAllPicturesXShopXID(@PathVariable(name="id") Integer id) {
		return shopServiceImp.showAllPicturesXShopXID(id);
	}
	
	//----------------------------------------------------------------------
	//--------------------------------------------  POST METHOD  (NEW SHOP)
	//----------------------------------------------------------------------

	@PostMapping("/shops")
	public Shop saveShop(@RequestBody Shop shop) {
		return shopServiceImp.saveShop(shop);
	}
	
	//-----------------------------------------------------------------------
	//----------------------------------  PUT METHOD (UPDATE ONE SHOP BY ID)
	//-----------------------------------------------------------------------
	

	@PutMapping("/shops/{id}")
	public Shop updateShop (@PathVariable(name="id") Integer id ,@RequestBody Shop shop){
		
		Shop shop_select = new Shop();
		
			shop_select = shopServiceImp.shopXID(id);
			shop_select.setName(shop.getName());
			shop_select.setCapacity(shop.getCapacity());
				
		Shop shop_update = new Shop();
		
			shop_update =shopServiceImp.updateShop(shop_select);
		
		return shop_update;
		
	}
	
	//--------------------------------------------------------------------
	//------------------------------------  DELETE METHOD   (DELETE SHOP)
	//----------------------CASCADE IN BBDD ------------------------------
	//--------------------------------------------------------------------

	
	@DeleteMapping("/shops/{id}")
	public void deleteShop(@PathVariable(name="id")Integer id){
		shopServiceImp.deleteShop(id);		
	}
	
	

}
