package com.jiayang.serviceImpl

import com.jiayang.bean.Book
import com.jiayang.daoImpl.BookDao
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Transactional
class BookService {
	@Autowired
	def BookDao bookdao
def doService(Book book,name)
{
	bookdao.addBook(book)
	bookdao.findBook(name)
	}
}
