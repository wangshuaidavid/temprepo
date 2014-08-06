package cn.enn.rd.HomeEnergyControlLite.controller;

import java.awt.image.RasterFormatException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.rd.HomeEnergyControlLite.entity.User;
import cn.enn.rd.HomeEnergyControlLite.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> users() {
		
		List<User> lu = userService.findAll();
		
		System.out.println(lu.toString());
		
		return lu;
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User users(@PathVariable Integer id, HttpServletResponse response) throws IOException {

		User ur = new User();
		ur.setName("uyioo");
		ur.setEmail("sdf@df.cn");
		response.setContentType("text/plain");
		response.getWriter().println("gogogoyoyoyo");
		return null;
	}
	
	@RequestMapping(value = "/t/{id}", method = RequestMethod.GET)
	public @ResponseBody User tt(@PathVariable Integer id, HttpServletResponse response) {

		List<User> lu = userService.findAll();
		//throw new RasterFormatException("aaa");
		return lu.get(0);
	}
	
	@ExceptionHandler
	public Map<String, Object> exceptionHandler(RuntimeException re) {
		
		Map<String, Object> model = new TreeMap<String, Object>();
		model.put("Status", false);
		return model;
		
	}
	
	
	@RequestMapping(value = "/error")
	public Map<String, Object> exceptionHandlerGeneral(HttpServletRequest request) {
		
		Map<String, Object> model = new TreeMap<String, Object>();
		model.put("GenStatus", false);
		return model;
		
	}
}
