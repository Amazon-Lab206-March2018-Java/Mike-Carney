package com.micarney.lookify.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.micarney.lookify.models.Song;

public interface Repositories extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findByArtist(String search);
	List<Song> findTop10ByOrderByRatingDesc();
	

}
