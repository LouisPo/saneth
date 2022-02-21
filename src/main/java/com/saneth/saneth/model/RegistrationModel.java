package com.saneth.saneth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

@Table(name = "registration")
public class RegistrationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int id;
	 String name;
	 String firstname;
	 String mail;

}
