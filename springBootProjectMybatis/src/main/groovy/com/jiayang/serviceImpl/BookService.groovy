package com.jiayang.serviceImpl

import com.jiayang.bean.Book
import com.jiayang.mapper.BookMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BookService {
	@Autowired
	def BookMapper bookMapper
def List<Book> getBookByName(String name)
{
	return bookMapper.selectBookByName(name)
	}
	@Transactional
	def addbookandreturn(id,bookname,price)
	{
		bookMapper.addBook(new Book(id:id,bookname:bookname,price:price))
		 bookMapper.selectBookByName(bookname)
	}
}
