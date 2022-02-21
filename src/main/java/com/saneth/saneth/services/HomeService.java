package com.saneth.saneth.services;

public class HomeService {
	
	private final long id;
	private final String content;
	
	public HomeService(long id, String content) {
		this.id=id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

}
