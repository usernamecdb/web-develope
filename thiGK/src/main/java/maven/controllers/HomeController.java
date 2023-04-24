package maven.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/Trangchu")
	public String trangChu()
	{
		return "home/Trangchu";
	}

}
