package com.asoinspiration.web.action;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.asoinspiration.domain.User;
import com.asoinspiration.utils.SysConstant;
import com.asoinspiration.utils.UtilFuns;

@Namespace("/")
@Results({ @Result(name = "login", location = "/WEB-INF/pages/sysadmin/login/login.jsp"),
		@Result(name = "success", location = "/WEB-INF/pages/home/fmain.jsp"),
		@Result(name = "logout", location = "/index.jsp") })
public class LoginAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	@Action("loginAction_login")
	public String login() throws Exception {

		if (UtilFuns.isEmpty(username)) {
			return "login";
		}

		Subject subject = SecurityUtils.getSubject();

		

		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		try {
			subject.login(token);
			User user = (User) subject.getPrincipal();
			session.put(SysConstant.CURRENT_USER_INFO, user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			super.put("errorInfo", "您的用户名或密码错误"); // 登录页面的错误信息提示
			return "login";
		}

	}

	// 退出
	@Action("loginAction_logout")
	public String logout() {
		session.remove(SysConstant.CURRENT_USER_INFO); // 删除session
		SecurityUtils.getSubject().logout(); // 登出
		return "logout";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
