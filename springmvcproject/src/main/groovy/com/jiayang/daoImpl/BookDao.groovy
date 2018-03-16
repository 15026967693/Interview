package com.jiayang.daoImpl

import com.jiayang.bean.Book
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
@Repository
class BookDao {
	@Autowired
def SessionFactory sessionFatory
def addBook(Book book)
{
	sessionFatory.getCurrentSession().saveOrUpdate(book)
	}
	def findBook(name)
	{
		sessionFatory.getCurrentSession().createQuery('from Book where name=?')
		.setParameter(0,"aaa").list().get(0)
		}
}
