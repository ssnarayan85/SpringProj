package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Book {

		@Id
		 long bookid;
		 String title;
		 double price;
		 int  volume;
		 Date publishDate ;

		public long getBookId() {
			return bookid;
		}

		public void setBookId(long bookId) {
			this.bookid = bookId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}

		public Date getPublishDate() {
			return publishDate;
		}

		public void setPublishDate(Date publishDate) {
			this.publishDate = publishDate;
		}

		@Override
		public String toString() {
			return "Book [bookId=" + bookid + ", title=" + title + ", price=" + price + ", volume=" + volume
					+ ", publishDate=" + publishDate + "]";
		}

}
