package app.spring.forms.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/security")
public class GeneralController {

	@RequestMapping(value="/secret",method=RequestMethod.GET)
	@ResponseBody
	public String getPublicSecret() {
		return "Anyone role should be able to see this";
	}
	
	@RequestMapping(value="/secret",method=RequestMethod.POST)
	@ResponseBody
	public String getPrivateSecret() {
		return "Only admins should be able to post to this url";
	}
	
	@RequestMapping("/home")
	public String getHome() {
		return getPath("home");
	}
	
	@RequestMapping("/user")
	public String getUser() {
		return getPath("user");
	}

	@RequestMapping("/forbidden")
	public String getForbidden() {
		return getPath("forbidden");
	}
	
	@RequestMapping("/admin")
	public String getadmin() {
		return getPath("admin");
	}
	
	static final String ROOT = "forms";

	private String getPath(String child) {
		return ROOT + "/" + child;
	}
}
