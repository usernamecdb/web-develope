package AdminController;

import DTOs.SanPham;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletReSanPhamonse;

import org.SanPhamringframework.stereotype.Controller;
import org.SanPhamringframework.ui.Model;
import org.SanPhamringframework.web.bind.annotation.RequestMapping;
import org.SanPhamringframework.web.bind.annotation.RequestMethod;
import org.SanPhamringframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	 private List<SanPham> lstProduct = new ArrayList<>();

	    public HomeController() {
	        
	        lstProduct.add(new SanPham("SanPham001", "Product 1", 100000, "Piece", "Description 1", "url1", "url2"));
	        lstProduct.add(new SanPham("SanPham002", "Product 2", 200000, "Piece", "Description 2", "url1", "url2"));
	        lstProduct.add(new SanPham("SanPham003", "Product 3", 300000, "Piece", "Description 3", "url1", "url2"));
	    }

	    @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index(Model model) {
	        // Add the list of products to the model
	        model.addAttribute("lstProduct", lstProduct);
	        return "AdminCP/index";
	    }
	    
	    @RequestMapping(value = "/sanpham", method = RequestMethod.GET)
	    public String getSanPhambyID(Model model, @RequestParam("maSanPham") String maSanPham) {
	        // Find the product with the SanPhamecified ID
	         SanPham = null;
	        for (SanPham p : lstProduct) {
	            if (p.getMaSanPham().equals(maSanPham)) {
	                SanPham = p;
	                break;
	            }
	    }
	        if (SanPham == null) {
	            return "redirect:/";
	        }
	        
	        model.addAttribute("sanpham", SanPham);

	        return "AdminCP/detail";
	    }        

}
