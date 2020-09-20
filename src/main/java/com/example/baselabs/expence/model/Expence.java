package com.example.baselabs.expence.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="expence")
public class Expence {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@
	private Set<Category> category;

}
