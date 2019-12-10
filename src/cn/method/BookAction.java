package cn.method;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{
	//添加
	public String add(){
		System.out.println("add...");
		return NONE;
	}
	//修改
	public String update() {
		System.out.println("update...");
		return NONE;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("execut..");
		return NONE;
	}
}
