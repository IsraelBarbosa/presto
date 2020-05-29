package usm.web.pretoplus.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SobreController {

	
	@RequestMapping("/sobre")
		public ModelAndView sobre(Authentication authentication) {
			ModelAndView resultado = new ModelAndView("presto/sobre/sobre");
			resultado.addObject("user", authentication);
			return resultado;	
		}
}
