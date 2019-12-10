package cn.action;

public class HelloAction {
	/**
	 * 1.访问Servlet时候，都会执行service方法(底层利用反射)
	 * -写类继承HttpServlet，重写类里面的方法
	 * -在web.xml中配置servlet访问路径
	 * 
	 * 2.访问action，默认执行execute方法
	 * -配置action访问路径
	 */
	public String execute(){
		return "ok";
	}
}
