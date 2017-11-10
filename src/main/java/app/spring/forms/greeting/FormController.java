package app.spring.forms.greeting;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}

	List<Greeting> greetings = Arrays.asList(
			new Greeting(0,"Hey"),
			new Greeting(1,"Yo"),
			new Greeting(2,"What up")
	);

	@GetMapping("/greetings")
	public String allGreetings(Model model) {
		model.addAttribute("greetings", greetings);
		return "greeting";
	}
	
	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting) {
		return "greeting";
	}
}
