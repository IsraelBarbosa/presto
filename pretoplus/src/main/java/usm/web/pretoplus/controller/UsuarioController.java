package usm.web.pretoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import usm.web.pretoplus.model.Usuario;
import usm.web.pretoplus.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	//Injeção do repositorio
	@Autowired
	private UsuarioRepository ur;
	
	
	//Método para cadastro 
	@GetMapping("/inseriruser")
	public ModelAndView inserir() {                  
		ModelAndView resultado = new ModelAndView("presto/cadastro/caduser");
		resultado.addObject("user", new Usuario());
		return resultado;
	}
	
	@PostMapping("/inseriruser")
	public String inserir (Usuario user) {
		user.setSenha(new BCryptPasswordEncoder().encode(user.getPassword()));
		ur.save(user);
		return "redirect:/cadsucess";
	}
	
	
	//Método para relizar a edição do cadastro
	
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
	
	
	//Método de erro no cadastro
	@RequestMapping("/caderror")
	public String error() {
		return "/presto/cadastro/cadastroerror";
	}
	
	//Método de sucesso no cadastro
	@RequestMapping("/cadsucess")
	public String sucess() {
		return "/presto/cadastro/cadastrosucesso";
	}
	
	
	
	//Método da listagem
	@GetMapping("/busca")
	public ModelAndView busca() {  //ALTERAR A PÁGINA ASSIM QUE RECEBER O LAYOUT
		ModelAndView resultado = new ModelAndView("presto/busca/buscar");
		List<Usuario> usuarios = ur.findAll();
		resultado.addObject("user", usuarios);
		return resultado;
	}
	
	
	
	@PostMapping("/cad")
	public String editar(Usuario user) {
		ur.save(user);
		return "redirect:/";
	}
	
}


