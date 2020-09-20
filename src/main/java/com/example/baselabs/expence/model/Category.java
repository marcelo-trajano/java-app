package com.example.baselabs.expence.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private User user;

}
