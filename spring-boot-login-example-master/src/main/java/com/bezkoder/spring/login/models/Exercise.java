package com.bezkoder.spring.login.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "exercise")
public class Exercise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 200)
	private String name;

	@NotBlank
	@Size(max = 200)
	private String type;

	@NotBlank
	@Size(max = 200)
	private String level;

	@NotBlank
	@Size(max = 500)
	private String description;

	@NotBlank
	@Size(max = 500)
	private String urlVideo;
	
	

	public Exercise() {
	}

	public Exercise(Long id, String name, String type, String level, String description, String urlVideo) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.level = level;
		this.description = description;
		this.urlVideo = urlVideo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}
	
	

}
