package Lab_Question1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Student {
@RequestMapping("/mukul") // annotion for request web map for handler class/method 
	public String show() { // show method
	return "index"; // return data stored in index file 
}
}
