package maven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController2 {
	// Trả về cho User trang để đăng nhập 
	@RequestMapping(value="login2", method = RequestMethod.GET)
	public String loginGet()
	{
		return "login2";		
	}
	// Xử lý khi user nhấn submit đăng nhập
	@RequestMapping(value="login2", method = RequestMethod.POST)
	public String loginPost(ModelMap model,@RequestParam("id") String tenDN,
			@RequestParam("pwd") String matKhau)
	{
		
		// tiếp theo, ta truy vấn bảng user, để tìm xem có không
		// nến có thì đăng nhật thành công, và ngược lại
		//---- ở bài này, ta bỏ qua bước truy cập csdl (học sau
		// ta hard-code
		if (tenDN.equals("admin") && matKhau.equals("62cnttclc"))
		{ // đăng nhập thành công, thì do sth
			// điều hướng đến trang chủ quản trị
			return "redirect: admincp/index.html";
			
		}else // đăng nhập không được
		{
			// gửi báo lỗi ra trang đăng nhập, thông qua model
			// ??   addAttribute(key, value for key)
			model.addAttribute("thongbaoLoi", "Thông tin đăng nhập không đúng"); 
			return "login2";	
		}
	}
}

