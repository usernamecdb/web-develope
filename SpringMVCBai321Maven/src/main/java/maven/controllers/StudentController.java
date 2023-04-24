package maven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import maven.beans.Student;
@Controller
public class StudentController {
	@RequestMapping("edit")
	public String suaSinhVien(ModelMap model) {
		
		Student sv = new Student("duy", 8.0,"java web 2");
		// chu y thuc te sv nay duoc lay tu csdl
		
		model.addAttribute("student",sv);
		//dữ liệu combo box
		String[]mJ= {"web1","web2","web3"};
		model.addAttribute("a", mJ);
		return"edit";
		
	}
	@RequestMapping(value = "update",method= RequestMethod.POST)
	public String CapNhatSinhVien(@ModelAttribute("student") Student sinhvien, ModelMap model) {
		model.addAttribute("svCapNhat",sinhvien);
		return "studentUpdatedData";
	}
	
}
