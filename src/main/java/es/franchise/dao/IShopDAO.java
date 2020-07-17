package es.franchise.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.franchise.dto.Shop;

public interface IShopDAO extends JpaRepository<Shop, Integer>{

}
