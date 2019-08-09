package com.bookflix.models;

import java.util.ArrayList;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="HR", name="bookflixUsers")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	
	@Column
	@NotNull
	private String userName;
	
	@Column
	@NotNull
	private String password;
	
	@Column
	@NotNull
	private String eMail;
	
	@Column
	@NotNull
	private String location;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Book> library = new ArrayList<Book>();
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, @NotNull String userName, @NotNull String password, @NotNull String eMail,
			@NotNull String location, List<Book> library) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.location = location;
		this.library = library;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + ((library == null) ? 0 : library.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", eMail=" + eMail
				+ ", location=" + location + ", library=" + library + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Book> getLibrary() {
		return library;
	}

	public void setLibrary(List<Book> library) {
		this.library = library;
	}
	
	public void addToLibrary(Book book) {
		this.library.add(book);
	}
}
