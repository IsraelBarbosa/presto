package usm.web.pretoplus.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import usm.web.pretoplus.model.Solicitante;

@Controller
public class IndexController {
 
	@RequestMapping("/")
	public ModelAndView index(Authentication authentication) {
		ModelAndView resultado = new ModelAndView("presto/index");
			
		resultado.addObject("user", authentication);
			return resultado;
		
	}
	
	
	

	
	
}
