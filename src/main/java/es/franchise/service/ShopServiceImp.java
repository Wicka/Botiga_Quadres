package es.franchise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.franchise.dao.IShopDAO;
import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

@Service
public class ShopServiceImp implements IShopService {
	
	@Autowired
	IShopDAO iShopDao;

	@Override
	public List<Shop> showShops() {
		
		return iShopDao.findAll();
	}

	@Override
	public Shop saveShop(Shop shop) {		
		return iShopDao.save(shop);
	}

	@Override
	public Shop shopXID(int id) {		
		return iShopDao.findById(id).get();
	}

	@Override
	public Shop updateShop(Shop shop) {
		return iShopDao.save(shop);
	}

	@Override
	public void deleteShop(int id) {
		iShopDao.deleteById(id);

	}

	

}
