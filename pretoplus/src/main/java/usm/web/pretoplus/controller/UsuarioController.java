package usm.web.pretoplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import usm.web.pretoplus.model.Usuario;
import usm.web.pretoplus.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository ur;
	
	@GetMapping("/inseriruser")
	public ModelAndView inserir() {                  //ALTERAR A PÁGINA ASSIM QUE RECEBER O LAYOUT
		ModelAndView resultado = new ModelAndView("presto/cadastro/caduser");
		resultado.addObject("user", new Usuario());
		return resultado;
	}
	
	@PostMapping("/inseriruser")
	public String inserir (Usuario user) {
		user.setSenha(new BCryptPasswordEncoder().encode(user.getPassword()));
		ur.save(user);
		return "redirect:/";
	}
	
	
	//Método para relizar a edição do cadastro de solicitante
	
	@GetMapping("/editarS/{login}")
	public ModelAndView edit(@PathVariable String login) {
		Usuario usuario = ur.getOne(login);
		ModelAndView resultado = new ModelAndView("presto/edicao/editar");
		resultado.addObject("user", usuario);
		return resultado;
	}
	
	
	//Método para cadastrar prestador
	@GetMapping("/editarP/{login}")
	public ModelAndView editar(@PathVariable String login) {
		Usuario usuario = ur.getOne(login);
		ModelAndView resultado = new ModelAndView("presto/cadastro/cadprest");
		resultado.addObject("user", usuario);
		return resultado;
	}
	
	@PostMapping("/cad")
	public String editar(Usuario user) {
		ur.save(user);
		return "redirect:/";
	}
	
	
	
	
	@RequestMapping("/teste")
	public String teste() {
		return "presto/cadastro/test";
	}
	
	
	//Retorna nome d usuario
	 @GetMapping(value = "/username")
	    @ResponseBody
	    public String currentUserName(Authentication authentication) {

	        if (authentication != null) {
	            return authentication.getName();

	        } else {
	            return "";
	        }
	    }
	
}


