package com.jiayang.mapper

import com.jiayang.bean.Book
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select

@Mapper
public interface BookMapper {
	@Select(" SELECT * FROM book WHERE bookname = #{bookname}")
	@Results([@Result(property="id",column="id"),@Result(property="bookname",column="bookname"),@Result(property="price",column="price")])
public List<Book> selectBookByName(@Param("bookname")String bookname)
@Insert("INSERT INTO book VALUES (#{id},#{bookname},#{price})")
public int addBook(Book book)
}
