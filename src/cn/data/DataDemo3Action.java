package cn.data;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.Book;
import cn.entity.User;

/**
 * 使用表达式封装数据到实体类对象
 * @author asus
 *
 */
public class DataDemo3Action extends ActionSupport {

	//1 声明实体类
	private User user;	
	private Book book;
	
	//2 生成实体类变量的set和get方法
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		System.out.println(book.getBname());
		return NONE;
	}






}
