package com.micarney.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.micarney.lookify.models.Song;
import com.micarney.lookify.repositories.Repositories;

@Service
public class services {
	private Repositories songRepo;
	public services(Repositories songRepo) {
		this.songRepo = songRepo;
	}
	
	public List<Song> allSongs(){
		return songRepo.findAll();		
	}
	
	public Song findById(Long id) {
		Optional<Song> song = songRepo.findById(id);
		if (song.isPresent()) {
			return song.get();
		}
		return null;
	}
	
	public List<Song> searchByArtist(String search) {
		return songRepo.findByArtist(search);
	}
	
	public List<Song> topRated() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
	public void addSong(Song song) {
		songRepo.save(song);
	}
	
	public void destroySong(Long id) {
		songRepo.deleteById(id);
	}
}
