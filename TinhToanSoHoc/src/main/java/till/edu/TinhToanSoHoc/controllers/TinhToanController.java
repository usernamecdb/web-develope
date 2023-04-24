package till.edu.TinhToanSoHoc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TinhToanController {
	//add,
	@GetMapping("/add")
	public String traVeFormTinh() {
		return "TinhTong";
	}

}
