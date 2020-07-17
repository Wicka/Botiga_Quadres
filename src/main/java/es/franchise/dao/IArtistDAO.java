package es.franchise.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.franchise.dto.Artist;

public interface IArtistDAO extends JpaRepository<Artist, Integer>{

}
