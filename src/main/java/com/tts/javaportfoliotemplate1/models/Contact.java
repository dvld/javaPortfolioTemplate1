package com.tts.javaportfoliotemplate1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Please provide your first name")
	private String firstName;
	
	@NotEmpty(message = "Please provide your last name")
	private String lastName;
			
	@Email(message = "Please provide a valid email")
	@NotEmpty(message = "Please provide an email")
	private String email;
	
	@NotEmpty(message = "Please provide a message")
	private String message;        
	
	@NotEmpty(message = "Please provide a reason for contacting")
	private String reason;

	// constructors //
	public Contact() {}

	public Contact(String firstName, String lastName, String email, String message, String reason) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
    this.message = message;
    this.reason = reason;
	}

	// getters and setters //
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
  }
  
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
}