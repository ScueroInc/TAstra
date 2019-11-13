package upc.edu.pe.spring.controller;

import java.text.ParseException;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import upc.edu.pe.spring.model.Engineer;
import upc.edu.pe.spring.service.IEngineerService;

@Controller
@RequestMapping("/engineer")
public class EngineerController {
	
	@Autowired
	private IEngineerService eService;
	
	@RequestMapping("/")
	public String irEngineer(Map<String,Object> model) {
		model.put("listaEngineers", eService.listar());
		return "listEngineers";		
	}
	
	@RequestMapping("/irRegistrar")
	public String irRegistrar(Model model) {
		
		model.addAttribute("engineer", new Engineer());
		return "enginner";
	}
	
	@RequestMapping("/registrar")
	public String registrar(@ModelAttribute @Valid Engineer objEngineer, BindingResult binRes, Model model)
		throws ParseException {
		if(binRes.hasErrors()) {
			return "engineer";
		}else {
			boolean flag = eService.Insert(objEngineer);
			if(flag) {
				return "redirect:/engineer/listar";
			}else {
				model.addAttribute("mensaje", "Ocurrio un error");
				return "redirect:/engineer/irRegistrar";
			}			
		}
	}
	
	@RequestMapping("/actualizar")
	public String actualizar(@ModelAttribute @Valid Engineer objEngineer, BindingResult bindRes, Model model,
			RedirectAttributes objRedir) throws ParseException {
		if(bindRes.hasErrors()) {
			return "redirect:/engineer/listar";
		}else {
			boolean flag = eService.modificar(objEngineer);
			
			if(flag) {
				objRedir.addFlashAttribute("mensaje","Se actualizó correctamente");
				return "redirect:/enginner/listar";
			}else {
				objRedir.addFlashAttribute("mensjae","Ocurrio un error");
				return "redirect:/enginner/listar";
			}
		}
	}
	/////////////
	@RequestMapping("/modificar/(id)")
	public String modificar (@PathVariable int id, Model model, RedirectAttributes objRedir) {
		return null;
	}
	
	@RequestMapping("/eliminar")
	public String eliminar(Map<String,Object> model,@RequestParam(value="id")Integer id ) {
			if(id !=null && id > 0) {
				eService.eliminar(id);
				model.put("listaEngineers", eService.listar());
				}
		return "listEngineers";
	}
	
	@RequestMapping("/listar")
	public String listar(Map<String, Object> model) {

		model.put("listaEngineers", eService.listar());
		return "listEngineers";
	}

	@RequestMapping("/listarId")
	public String listarId(Map<String, Object> model, @ModelAttribute Engineer engineer) {
		
		eService.listarid(engineer.getId_engineer());
		return "listEnginners";
	}

	@RequestMapping("/buscar")
	public String buscar(Map<String, Object> model, @ModelAttribute Engineer engineer) throws ParseException {
		return null;
	}

	@RequestMapping("/irBuscar")
	public String irBuscar(Model model) {
	return null;
	}
}
