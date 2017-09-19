/* Create  a Controller Class that will handle various URL mappings and all will be mapped to same Method handler
 * It will generate Data (Greetings) and Logical View name
 * */

package net.nrp.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	// controller

//Handler Mapper that will help to resolve the
// request based on the url i.e mentioned in the
// RequestMapping annotation
public class PageController 
{

	@RequestMapping(value = {"/","/home","/index" })
	// Specify multiple URLs
	// Model and View is the class that will have Model as well the View name
	public ModelAndView index() {

		// Create an object for ModelAndView
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);

		return mv;
	}

	@RequestMapping(value = "/about")
	// Model and View is the class that will have Model as well the View name
	public ModelAndView about() {

		// Create an object for ModelAndView
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);

		return mv;
	}

	@RequestMapping(value = "/contact")
	// Model and View is the class that will have Model as well the View name
	public ModelAndView contact() {

		// Create an object for ModelAndView
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);

		return mv;
	}
}
