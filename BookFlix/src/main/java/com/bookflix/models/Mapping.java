package com.bookflix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Mapping {
	private int bookId;
	private int ownerId;
	private int lessieId;
	private String bookName;
	private String lessieName;
	
	public Mapping() {
		// TODO Auto-generated constructor stub
	}

	public Mapping(int bookId, int ownerId, int lessieId, String bookName, String lessieName) {
		super();
		this.bookId = bookId;
		this.ownerId = ownerId;
		this.lessieId = lessieId;
		this.bookName = bookName;
		this.lessieName = lessieName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + lessieId;
		result = prime * result + ((lessieName == null) ? 0 : lessieName.hashCode());
		result = prime * result + ownerId;
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
		Mapping other = (Mapping) obj;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (lessieId != other.lessieId)
			return false;
		if (lessieName == null) {
			if (other.lessieName != null)
				return false;
		} else if (!lessieName.equals(other.lessieName))
			return false;
		if (ownerId != other.ownerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mapping [bookId=" + bookId + ", ownerId=" + ownerId + ", lessieId=" + lessieId + ", bookName="
				+ bookName + ", lessieName=" + lessieName + "]";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getLessieId() {
		return lessieId;
	}

	public void setLessieId(int lessieId) {
		this.lessieId = lessieId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getLessieName() {
		return lessieName;
	}

	public void setLessieName(String lessieName) {
		this.lessieName = lessieName;
	}

	
	
	
}
