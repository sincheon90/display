package com.ojk.display.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlanController {
	
	@RequestMapping("/plan")
	public String plan(Model model) {
		int stock = 200;
		int order = 500;
		model.addAttribute("model", "P1234");
		model.addAttribute("stock", stock);
		model.addAttribute("order", order);
		model.addAttribute("order-stock", order-stock);
		return "plan";
	}
	
}
