package com.devsuperior.movieflix.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long movieId;
	private Long userId;

	@NotBlank(message = "Campo obrigatório")
	private String text;

	private User user;
	
	public ReviewDTO() {
	}

	public ReviewDTO(Long id, Long movieId, Long userId, String text) {
		this.id = id;
		this.movieId = movieId;
		this.userId = userId;
		this.text = text;
	}
	
	public ReviewDTO(Review entity) {
		this.id = entity.getId();
		this.movieId = entity.getMovie().getId();
		this.userId = entity.getUser().getId();
		this.text = entity.getText();		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
