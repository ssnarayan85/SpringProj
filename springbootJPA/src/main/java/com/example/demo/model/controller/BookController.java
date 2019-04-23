package com.example.demo.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Bookdao;
import com.example.demo.model.Book;

@Controller
public class BookController {
	
	@Autowired
	Bookdao bdao;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

	@RequestMapping("/addBook")
	public String addBook(Book bk)
	{
		bdao.save(bk);
		return "home.jsp";
	}

	@RequestMapping("/getBook")
	public ModelAndView getBook(@RequestParam long bookid)
	{
	    ModelAndView mv = new ModelAndView("showBook.jsp");
		Book book = bdao.findById(bookid).orElse(new Book());
		mv.addObject(book);
		return mv;
	}
	
	@RequestMapping("/getBookByTitle")
	public ModelAndView getBookByTitle(@RequestParam String title)
	{
	    ModelAndView mv = new ModelAndView("showBook.jsp");
		List<Book>  bookSet = bdao.findByTitle(title);
		bookSet.forEach(System.out::println);
		mv.addObject("books", bookSet);
		return mv;
	}
	
	@RequestMapping("/delBook")
	public ModelAndView delBook(@RequestParam long bookid)
	{
	    ModelAndView mv = new ModelAndView("showBook.jsp");
	    bdao.deleteById(bookid);
		bdao.findAll().forEach(System.out::println);
        System.out.println("Book with Id:" + bookid + "deleted");
		return mv;
	}
}
