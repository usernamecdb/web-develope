package maven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admincp")
public class AdminController {
	@RequestMapping("/index")
	public String TrangChuQuanTri()
	{
		return "admincp/index";
	}
}