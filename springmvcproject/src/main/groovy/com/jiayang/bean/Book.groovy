package com.jiayang.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="book_table")
public class Book {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	def String id;
	@Column
def  String name;
def  Book(String name) {
	super();
	this.name = name;
}
def  Book() {
	super();
}

}
