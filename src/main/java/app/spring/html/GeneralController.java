package app.spring.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class GeneralController {
	
	@RequestMapping("/index")
	public String getHome() {
		return getPath("index");
	}
	
	@RequestMapping("/iframe")
	public String getFrame() {
		return getPath("iframe");
	}
	
	static final String ROOT = "html";

	private String getPath(String child) {
		return ROOT + "/" + child;
	}
}
