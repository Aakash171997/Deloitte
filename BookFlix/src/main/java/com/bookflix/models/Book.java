package com.bookflix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="HR", name="bookList")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookRef;
	
	@Column
	@NotNull
	private int ownerId;
	
	@Column
	@NotNull
	private String bookName;
	
	@Column
	@NotNull
	private String authors;
	
	@Column
	@NotNull
	private String description;
	
	@Column
	private String isbn;
	
	@Column
	private String status;
	
	@Column
	private int lessieId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="book_id")
	private Users user;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(@NotNull int bookRef, @NotNull int ownerId, @NotNull String bookName, @NotNull String authors,
			@NotNull String description, String isbn, @NotNull String status, @NotNull int lessieId) {
		super();
		this.bookRef = bookRef;
		this.ownerId = ownerId;
		this.bookName = bookName;
		this.authors = authors;
		this.description = description;
		this.isbn = isbn;
		this.status = status;
		this.lessieId = lessieId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookRef;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + lessieId;
		result = prime * result + ownerId;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookRef != other.bookRef)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (lessieId != other.lessieId)
			return false;
		if (ownerId != other.ownerId)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [bookRef=" + bookRef + ", ownerId=" + ownerId + ", bookName=" + bookName + ", authors=" + authors
				+ ", description=" + description + ", isbn=" + isbn + ", status=" + status + ", lessieId=" + lessieId
				+ "]";
	}

	public int getBookRef() {
		return bookRef;
	}

	public void setBookRef(int bookRef) {
		this.bookRef = bookRef;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getLessieId() {
		return lessieId;
	}

	public void setLessieId(int lessieId) {
		this.lessieId = lessieId;
	}
}
