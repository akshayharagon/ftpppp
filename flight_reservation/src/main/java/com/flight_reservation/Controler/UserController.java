package com.flight_reservation.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation.Entities.User;
import com.flight_reservation.Repository.UserRespository;

@Controller
public class UserController {

	@Autowired
	private UserRespository userrepo;

	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping("/showReg")
	public String showReg() {
		return "showRegpage";
	}

	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user) {
		userrepo.save(user);
		return "login";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap model) {
		User user = userrepo.findByEmail(email);
		if (user != null && user.getEmail().equals(email) && user.getPassword().equals(password)) {
			model.addAttribute("user", user);
			return "findFlights";
		} else {
			model.addAttribute("errorMsg", "Invalid Login Credentails");
			return "login";
		}
	}
}
