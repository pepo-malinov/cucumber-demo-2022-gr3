package uni.fmi.register.model;

import uni.fmi.register.RegisterService;

public class RegisterScreenModel {

	private String username;
	private String firstPassword;
	private String secondPassword;
	private String email;
	private String message;

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setFirstPassword(String password) {
		this.firstPassword=password;
	}

	public void setSecondPassword(String password) {
		this.secondPassword=password;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public void clickRegisterButton() {
		message = RegisterService.register(username, firstPassword, secondPassword, email);
	}

	public String getMessage() {
		return message;
	}

}
