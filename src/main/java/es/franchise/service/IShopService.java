package es.franchise.service;

import java.util.List;

import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

public interface IShopService {

	public List<Shop> showShops();
	public Shop saveShop(Shop shop);
	public Shop shopXID(int id);
	public Shop updateShop (Shop shop);
	public void deleteShop(int id);	
	public List<Picture> showPictures(int id);	
}
