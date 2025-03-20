package hr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;


@Controller//(accounts)
public class myController {

	@RequestMapping("/visitor.htm")
	public String showVisitor(@RequestParam("firstName") String fn, Mapper m) {
		m.addObject("visitor", visitor);
		return "hello";
	}
	
	@RequestMapping("/register.htm")
	public ModelAndViewContainer registerVisitor() {
		ModelAndViewContainer mv = new ModelAndViewContainer().addObject(attributeName, attributeValue);
		mv.setView("x");
		return mv;
	}
	
	
	
}