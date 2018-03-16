package com.jiayang.controller

import com.jiayang.bean.Book
import com.jiayang.serviceImpl.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
@Controller
class mainController {
	@Autowired
 def BookService bookService
 @RequestMapping("/1.html")
 def go(Model model)
 {
	 model.addAttribute("book",bookService.doService(new Book("aaa"),"aaa"))
	 "aaa"
 }
 @RequestMapping("/2.html")
  def go2()
  {
	  "bbb"
  }
  @RequestMapping("/3.html")
  def jsp()
  {
	  "hii"
  }
  @RequestMapping("/4.html")
  def nav() {
	  "nav"
  }
  @ExceptionHandler(Exception.class)
  def String err(Model model) {
	  model.addAttribute("err","this is an error")
	  return "bbb"
  }
}
