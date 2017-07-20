/**
 * 
 */
package com.example.testProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author SESA336080
 *
 */
@Controller
public class HelloController {
	
	 @RequestMapping("/hello.htm")
	    public String index() {
	        return "index";
	    }
	 
	 @RequestMapping("/test.htm")
	    @ResponseBody
	    public String getName() {
	        return "Rakhi";
	    }

}
