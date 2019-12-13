package cn.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport {
	
	public String execute() throws Exception {
		//第一种方式：使用ActionContext对象
		//1.调用静态方法得到ActionContext对象
		ActionContext context = ActionContext.getContext();
		//2.调用方法得到表单数据
		//Map中有key-value，key是表单的name，value是输入的值
		Map<String, Object> map = context.getParameters();
		Set<String> keys = map.keySet();
		for(String key : keys){
			//根据key获取value
			//数组形式：因为输入项里面可能有复选框情况
			Object[] object = (Object[]) map.get(key);
			System.out.println(Arrays.toString(object));
		}
		
		return NONE;
	}
}
