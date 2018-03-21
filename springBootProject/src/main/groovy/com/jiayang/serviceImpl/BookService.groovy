package com.jiayang.serviceImpl

import com.jiayang.bean.Book
import com.jiayang.daoImpl.BookDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class BookService {
	@Autowired
	def BookDao bookdao
	
def saveBook(Book book)
{
	return bookdao.save(book)
	}
	def Page<Book> findBook(Pageable pageable)
	{
		return bookdao.findAll(pageable)
		}
}
