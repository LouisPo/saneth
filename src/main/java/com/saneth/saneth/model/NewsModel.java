package com.saneth.saneth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
@Entity
public class NewsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer id;
	 String text;
	 String title;
	 String date;
}
