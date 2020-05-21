package usm.web.pretoplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuscarController {
	
	@RequestMapping("/busca")
	public String login() {
		return "presto/busca/buscar";	
	}
}
