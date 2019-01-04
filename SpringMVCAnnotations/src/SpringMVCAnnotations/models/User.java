package SpringMVCAnnotations.models;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import springwork.customAnnotations.DateValidateConstraint.ValidDate;
import springwork.customAnnotations.PasswordConstraint;

public class User {
	@NotNull
	private String username;
	private String email;
	

	@ValidDate
	private String dob;
	
	@PasswordConstraint
	private String password;
	
	public User(String username, String email, String dob, String password) {
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the email
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param email the email to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}	

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
