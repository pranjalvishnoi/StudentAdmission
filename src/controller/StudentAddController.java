package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/mm/dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public ModelAndView admissionSuccess(@RequestParam Map<String, String> argMap,@Valid @ModelAttribute("studentDetails") Student xyz, BindingResult result)
	{
	//	 for checking Exceptionhandler
//		int a=1;
//		if(a==1)
//			throw new NullPointerException("HI, throwing exception");
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
	
	
	
/*	moving to Exception handler class
 	
 	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		System.out.println("Null pointer exception occured"+e);
		
		return "ExceptionHandled";
		
	}
	
	@ExceptionHandler(value=Exception.class)
	public String allException(Exception e) {
		System.out.println("Null pointer exception occured"+e);
		return "ExceptionHandled";
		
	}*/
}
