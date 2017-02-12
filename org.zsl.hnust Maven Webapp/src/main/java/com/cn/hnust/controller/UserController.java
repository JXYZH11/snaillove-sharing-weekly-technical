package com.cn.hnust.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.Result;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(User user, HttpServletRequest request, Model model) {
		List<User> list = userService.findList(user);
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/toadd")
	public String toadd(HttpServletRequest request, Model model) {
		return "add";
	}

	@RequestMapping("/add")
	@ResponseBody
	public Result add(User user, HttpServletRequest request, Model model) {
		Result result = new Result();
		try {
			userService.insert(user);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage("执行失败");
			result.setStatus("1");
		}
		return result;
	}

	@RequestMapping("/toupdate")
	public String toupdate(User user, HttpServletRequest request, Model model) {
		User entity = userService.selectByPrimaryKey(user);
		model.addAttribute("user", entity);
		return "edit";
	}

	@RequestMapping("/update")
	@ResponseBody
	public Result update(User user, HttpServletRequest request, Model model) {
		Result result = new Result();
		try {
			userService.updateByPrimaryKey(user);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage("执行失败");
			result.setStatus("1");
		}
		return result;
	}
}
