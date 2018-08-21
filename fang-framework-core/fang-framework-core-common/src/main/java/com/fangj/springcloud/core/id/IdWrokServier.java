package com.fangj.springcloud.core.id;

import org.springframework.beans.factory.annotation.Autowired;

public class IdWrokServier {
	
	@Autowired
	private IdGenerate<Long> IDServer;
	
	public static void main(String[] args) {
		IdWrokServier id = new IdWrokServier();
		System.out.println(id.IDServer.generate());
	}
}
