package com;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords() {
		logininfo.put("Filemon", "123");
		logininfo.put("daniluk062", "456");
		logininfo.put("Alvares", "789");

	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
