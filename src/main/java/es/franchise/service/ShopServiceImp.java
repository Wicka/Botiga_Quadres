package es.franchise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.franchise.dao.IPictureDAO;
import es.franchise.dao.IShopDAO;
import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

@Service
public class ShopServiceImp implements IShopService {
	
	@Autowired
	IShopDAO iShopDao;
	

	//---------------------------------------------------------------------
	//----------------------------------------------  GET METHODS (VIEWS)
	//---------------------------------------------------------------------
	

	@Override
	public List<Shop> showShops() {		
		return iShopDao.findAll();
	}

	@Override
	public Shop shopXID(int id) {		
		return iShopDao.findById(id).get();
	}
	
	@Override
	public List<Picture> showAllPicturesXShopXID(int id) {		
		return iShopDao.findById(id).get().getPictures();
	}

	//----------------------------------------------------------------------
	//--------------------------------------------  POST METHOD  (NEW SHOP)
	//----------------------------------------------------------------------

	@Override
	public Shop saveShop(Shop shop) {		
		return iShopDao.save(shop);
	}

	//-----------------------------------------------------------------------
	//----------------------------------  PUT METHOD (UPDATE ONE SHOP)
	//-----------------------------------------------------------------------
	
	@Override
	public Shop updateShop(Shop shop) {
		return iShopDao.save(shop);
	}
	
	
	//--------------------------------------------------------------------
	//------------------------------------  DELETE METHOD   (DELETE SHOP BY ID)
	//----------------------CASCADE IN BBDD ------------------------------
	//--------------------------------------------------------------------

	@Override
	public void deleteShop(int id) {				
		iShopDao.deleteById(id);			
	}	

}
