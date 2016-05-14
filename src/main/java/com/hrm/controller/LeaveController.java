package com.hrm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hrm.dao.LeaveDAO;

@Controller
public class LeaveController {
	@Resource
	private LeaveDAO leaveDao;

	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/leaves";
	}

	@RequestMapping(value = "/leaves", method = RequestMethod.GET)
	public String getAllLeave(Model model) {
		model.addAttribute("cars", leaveDao.getAllLeave());
		return "leaveList";
	}
}
