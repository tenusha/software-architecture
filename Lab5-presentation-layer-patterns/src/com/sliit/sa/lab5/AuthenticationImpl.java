package com.sliit.sa.lab5;

public class AuthenticationImpl implements Authentication {

	private static Authentication authentication = null;

	String uName = "tenusha";
	String pass = "tenusha123";

	private AuthenticationImpl() {

	}

	public static Authentication getInstance() {
		if (authentication == null) {
			authentication = new AuthenticationImpl();
		}
		return authentication;
	}

	@Override
	public boolean authenticate(String uName, String pass) {
		if(this.uName.equals(uName)&&this.pass.equals(pass)){
			return true;
		}
		return false;
	}

}
