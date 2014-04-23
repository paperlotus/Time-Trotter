package com.custom.domain;

public enum Rating implements DomainEnum{
	One("1"),
	Two("2"),
	Three("3"),
	Four("4"),
	Five("5");
	private boolean uiHidden = false;
	@Override
	public boolean uiHidden() {
		return uiHidden;
	}
	private String forName;
	
	private Rating(String forName){
		this.forName=forName;
	}
	
	public String getName(){
		return forName;
	}
}
