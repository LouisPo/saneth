package com.saneth.saneth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
@Entity
public class HomelogModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int id;
	 String name;
	 String firstname;
	 String mail;

}
