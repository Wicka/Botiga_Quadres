package es.franchise.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.franchise.dto.Picture;
import es.franchise.dto.Shop;

public interface IPictureDAO extends JpaRepository<Picture, Integer>{

}
