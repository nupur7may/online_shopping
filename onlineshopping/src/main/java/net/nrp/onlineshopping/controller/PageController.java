/* Create  a Controller Class that will handle various URL mappings and all will be mapped to same Method handler
 * It will generate Data (Greetings) and Logical View name
 * */


package net.nrp.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller   //controller
public class PageController  //Handler Mapper that will help to resolve the request based on the url i.e mentioned in the RequestMapping annotation
{
	
	@RequestMapping(value={"/", "/home", "/index"})  //Specify multple URLs
	
	//Model and View is the class that will have Model as well the View name
	public ModelAndView index(){
		
		// Create an object for ModelAndView
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC!");
		
		return mv;		
		}
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){ //this does not make is mandatory to specify the greeting message in the url, if nothing is mentioned it will display the default 
//		
//		if (greeting == null) {
//			
//			greeting ="hello there"; // the default display greeting, when url does not mention what is value of greeting
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		
//		return mv;
//		
//	}
//	@RequestMapping(value="/test/{greeting}")   // greeting in curly brackets indicate that it's value is dynamic
//	public ModelAndView test(@PathVariable("greeting")String greeting)     //this does not make is mandatory to specify the greeting message in the url, if nothing is mentioned it will display the default 
//	{
//		if (greeting == null) {
//			
//			greeting ="hello there"; // the default display greeting, when url does not mention what is value of greeting
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		
//		return mv;
//		
//	}
}
