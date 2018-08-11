package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import input.Student;

@Controller
public class StudentAddController {
	
	@RequestMapping(value="/admission", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	@ModelAttribute
	public void addCommonObj(Model model1)
	{
		model1.addAttribute("headerMsg", "Welcome to this page");
	}
	
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public ModelAndView admissionSuccess(@RequestParam Map<String, String> argMap, @ModelAttribute("studentDetails") Student xyz, BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView model=new ModelAndView("AdmissionForm");	
			return model;
		}
		ModelAndView model=new ModelAndView("AdmissionSucess");
		/*model.addObject("stuName", argMap.get("studentName"));
		model.addObject("stuClass", argMap.get("studentClass"));*/
		return model;
	}
}
