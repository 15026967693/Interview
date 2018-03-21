package com.jiayang.daoImpl

import com.jiayang.bean.Book
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface BookDao extends JpaRepository<Book,String>{
   def Page<Book> findAll(Pageable pageable)
   def Book save(Book book)
}
