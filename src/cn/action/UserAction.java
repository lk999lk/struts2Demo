package cn.action;

import com.opensymphony.xwork2.Action;

/**
 * @Description 实现接口 
 * @author lk
 * @date 2019年12月9日 下午9:47:22
 */
public class UserAction implements Action{

	public String execute() throws Exception {
//		return null;
//		return SUCCESS;
		System.out.println("zhixing...");
		return NONE;
	}
}
