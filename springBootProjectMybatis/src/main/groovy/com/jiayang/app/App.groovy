package com.jiayang.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer
//import com.jiayang.bean.Book
import com.jiayang.serviceImpl.BookService

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages=[
	"com.jiayang.controller",
	"com.jiayang.config",
	"com.jiayang.serviceImpl",
	"com.jiayang.aspect"])
//@EnableJpaRepositories(basePackages = "com.jiayang.dao")
//@EntityScan(basePackages = "com.jiayang.bean")
class App extends SpringBootServletInitializer
{
def static main(args)
{
	//groovy原生aop注入
	/*BookService.metaClass.invokeMethod= {String name,arg->
		System.out.println("hiiiiiiiiiiiiiii")
		def result= BookService.getMetaClass().getMethod(name,arg).invoke(delegate,arg)
		System.out.println("hiiiiiiiiiiiiiii")
	result
	}*/
	def ConfigurableApplicationContext  ctx=SpringApplication.run(App.class, args)
	//后置的bookservice无法捕获
	/*BookService.metaClass.invokeMethod= {String name,arg->
		System.out.println("hiiiiiiiiiiiiiii")
		def result= BookService.getMetaClass().getMethod(name,arg).invoke(delegate,arg)
		System.out.println("hiiiiiiiiiiiiiii")
	result
	}*/

}
}
