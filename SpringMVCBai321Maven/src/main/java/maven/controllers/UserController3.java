package maven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import maven.beans.User;


@Controller
public class UserController3 {
	@RequestMapping(value = "login3", method = RequestMethod.GET)
	public String loginGet() {
		return "login3";
	}
	@RequestMapping(value = "login3", method = RequestMethod.POST)
	public String loginPost(ModelMap model,User user)
			
	{
		if (user.getId().equals("admin") && user.getPwd().equals("62cnttclc")) {
			//đăng nhập thành công
			return "redirect: admincp/index.html";
		}else {
			//gửi báo lỗi ra trang đăng nhập
			//??
			//đăng nhập thất bại
			model.addAttribute("thongbaoLoi", "Thông tin đăng nhập không đúng");
			return "login3";
		}
	}
	//Test tra ve mot chuoi
	
	@ResponseBody
	@RequestMapping("/xinchuoi")
	public String tesChuoi() {
		return"Day la chuoi toi cho ban";
	}
}