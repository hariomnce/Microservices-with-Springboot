package com.microservices.userservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "ID")
	private String uId;

	@Column(name = "NAME", length = 10)
	private String name;

	@Column(name = "EMAIL")
	@Email
	private String email;

	@Column(name = "ABOUT")
	private String about;

	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
}
