package com.custom.domain;

public enum Salutation implements DomainEnum{
	Mr("Mr"),
	Miss("Miss"),
	Mrs("Mrs");
	
	private String forName;
	private boolean uiHidden = false;
	@Override
	public boolean uiHidden() {
		return uiHidden;
	}
	private Salutation(String forName){
		this.forName=forName;
	}
	
	public String getName(){
		return forName;
	}
	
}
