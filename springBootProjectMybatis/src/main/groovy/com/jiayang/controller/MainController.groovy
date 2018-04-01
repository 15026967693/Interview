package com.jiayang.controller

import com.jiayang.bean.Book
import com.jiayang.serviceImpl.BookService

import javax.sql.DataSource

import org.springframework.beans.factory.annotation.Autowired
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
	def uuid=UUID.randomUUID().toString()
	println uuid
	model.addAttribute("books", bookService.addbookandreturn(uuid,"我加的书",15.6f))
	return "index"
	}
}
