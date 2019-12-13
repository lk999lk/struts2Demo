package cn.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.entity.User;
/**
 * 使用模型驱动获取表单数据
 * @author asus
 *
 */
public class DataDemo2Action extends ActionSupport implements ModelDriven<User>{

	//创建对象
	//前提要求： 表单输入项name属性值 和 实体类属性名称一样
	private User user = new User();
	public User getModel() {
		//返回创建user对象
		return user;
	}

	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}

}
