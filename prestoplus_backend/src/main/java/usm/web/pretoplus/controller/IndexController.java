package usm.web.pretoplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
 
	@RequestMapping("/")
	public String index() {
		return "presto/index.html";
	}
}
