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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shop shopXID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shop updateShop(Shop shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteShop(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Picture> showPictures(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
