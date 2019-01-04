package SpringMVCAnnotations.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringMVCAnnotations.models.User;

@Controller
public class IndexController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"username"});
	}
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
				return mav;
	}
	
	@RequestMapping(value="/userInfo", method = RequestMethod.POST)
	public ModelAndView user_info(@ModelAttribute("userkey") @Valid User u, BindingResult errors) {
		if(errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
		ModelAndView mav =  new ModelAndView("UserPage");
		return mav;
	}
	
	@ModelAttribute("userkey")
	public User setupUserModel(String username, String email, String dob, String password) {
		return new User(username, email, dob, password);
	}


}
