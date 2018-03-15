package ge.com.predix.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

	//@Value("${ge.com.predix.lab.microservice.menu}")
	//private String msName;

	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}
}
