package com.jiayang.bean

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

import org.hibernate.annotations.GenericGenerator

@Entity
class Book {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
    def String id
	def String bookname
	def float price
}
