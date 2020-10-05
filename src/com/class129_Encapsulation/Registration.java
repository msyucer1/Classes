package com.class129_Encapsulation;

public class Registration {

	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, user name and password. 
	 * Requirements: Valid email consider to be only gmail Valid userName
	 * and password cannot be empty and should be of length larger than 6 characters. 
	 * Also valid password cannot contain userName.
	 */
	
    protected String email;
    protected String userName;
    protected String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() >6) {
				this.userName = userName;
			}else {
				System.out.println("Username should be more than 6 characters");
			}
		}else {
			System.out.println("User name can not be empty");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.contains("gmail")){
			this.email = email; 
		}else {
			System.out.println("Please provide only gmail");
		}
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() >6) {
				this.password = password;
			}else {
				System.out.println("Password should be more than 6 characters");
			}
		}else {
			System.out.println("Password can not be empty");
		}
	}
}
