package com.training.FlipkartClone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Category {
@Id
@Column
@GeneratedValue(strategy = GenerationType.TABLE)
private int id;
@Column
private String name;
public Category() {
	super();
	// TODO Auto-generated constructor stub
}

}
