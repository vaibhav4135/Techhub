package com.logic;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("u")
public class ctrl {
	@RequestMapping("/")
	public String First(Locale locale,Model model) {
		  model.addAttribute("un", new Login());
		return "login";
	}

	@RequestMapping("/view")
	public String viewData() {
		return "view";
	}

	@RequestMapping("/valid")
	public String validate(@ModelAttribute("un") @Valid Login login, BindingResult result, Model model) {

		if (result.hasErrors()) {
			   model.addAttribute("umsg","username is empty");
			return "login";
		} else {
			model.addAttribute("u",login.getUser());
			return "welcome";
		}
	}
}




