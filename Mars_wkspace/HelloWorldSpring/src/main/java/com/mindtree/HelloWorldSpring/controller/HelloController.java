package com.mindtree.HelloWorldSpring.controller;

@Controller
@RequestMapping("/hello")
public class HelloController {
	 @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	 }

}
