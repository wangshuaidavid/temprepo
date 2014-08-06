package cn.enn.rd.HomeEnergyControlLite.controller;

import java.io.IOException;
import java.util.List;





import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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
		return lu.get(0);
	}
}
