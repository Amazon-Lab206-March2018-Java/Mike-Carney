package com.micarney.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micarney.lookify.models.Song;
import com.micarney.lookify.services.services;

@Controller
public class Songs {
	private final services songService;
	public Songs(services songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model m) {
		List<Song> songs = songService.allSongs();
		m.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "add.jsp";
	}
	@PostMapping("/songs/new")
	public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult results) {
		if (results.hasErrors()) {
			return "add.jsp";
		} else {
			songService.addSong(song);
			return "redirect:/dashboard";
		}
	}
		
	@RequestMapping("/search")
	public String search(@RequestParam(value="artist") String search, Model m) {
		List<Song> results = songService.searchByArtist(search);
		if (results.isEmpty()) {
			m.addAttribute("found", false);
			m.addAttribute("artist", search);
		} else {
			m.addAttribute("found", true);
			m.addAttribute("results", results);
			m.addAttribute("artist", search);
		}
		return "search.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String details(@PathVariable("id") Long id, Model m) {
		Song song = songService.findById(id);
		m.addAttribute("song", song);
		return "details.jsp";
	}
	
	@RequestMapping("/songs/topTen")
	public String topTen(Model m) {
		List<Song> results = songService.topRated();
		m.addAttribute("results", results);
		return "topTen.jsp";
	}
	
	@RequestMapping("/songs/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		songService.destroySong(id);
		return "redirect:/dashboard";
	}
}
	
	
