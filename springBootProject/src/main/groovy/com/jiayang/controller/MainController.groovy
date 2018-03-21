package com.jiayang.controller

import com.jiayang.bean.Book
import com.jiayang.serviceImpl.BookService

import javax.sql.DataSource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.domain.Sort.Direction
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer

@Controller
class MainController {
	@Autowired
	def BookService bookService
	@RequestMapping("/")
def go(Model model)
{
	bookService.saveBook(new Book(bookname:"a book",price:10.5f))
	Sort sort=new Sort(Direction.ASC,"id")
	Pageable pageable=new PageRequest(0,3,sort)
	bookService.findBook(pageable)
	model.addAttribute("books",bookService.findBook(pageable).getContent())
	return "index"
	}
}
