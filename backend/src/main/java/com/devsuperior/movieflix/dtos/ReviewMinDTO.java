package com.devsuperior.movieflix.dtos;

import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public class ReviewMinDTO {

	private Long id;
	@NotBlank(message = "Campo obrigatório")
	private String text;
	private Long movieId;
	private UserDTO user;

	public ReviewMinDTO() {
	}

	public ReviewMinDTO(Long id, String text, Long movieId) {
		this.id = id;
		this.text = text;
		this.movieId = movieId;
	}

	public ReviewMinDTO(Review entity, User user) {
		id = entity.getId();
		text = entity.getText();
		movieId = entity.getMovie().getId();
		this.user = new UserDTO(user);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
}
