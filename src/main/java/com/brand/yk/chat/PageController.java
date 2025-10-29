package com.brand.yk.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping({"/", "/chat"})
	public String chatPage() {
		return "chat";
	}
}


