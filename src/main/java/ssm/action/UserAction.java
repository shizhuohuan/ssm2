package ssm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ssm.entity.User;
import ssm.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;


@Controller
public class UserAction {
	
	@Autowired
	private UserService userService ;
	@RequestMapping("/getByid.action")
	public ModelAndView getByid(HttpServletRequest request) throws Exception {
		ModelAndView md = new ModelAndView();	
		int id = Integer.parseInt(request.getParameter("uid")) ;	
		User u = userService.get(id) ;
		md.addObject("user", u) ;
		md.setViewName("user");	
		return md;
	}	
	@RequestMapping("/getByid2.action")
	public String getByid2(int uid,Model model) throws Exception {
	
		User user = userService.get(uid) ;
		model.addAttribute("user", user) ;
		return "user";
	}

	@RequestMapping("/getAll.action")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
	
		ModelAndView md = new ModelAndView();
		
		List<User> list = userService.getAll() ;
		
		md.addObject("ulist", list) ;
		md.setViewName("user_list");
		
		return md;
	}
	
	
	@RequestMapping("/save.action")
	public String save(User user) throws SQLException{
		
		userService.update(user) ;
		return "user_list";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	

}
