import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.board.model.dto.LoginDto;



public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping("/login.do")
	public String login(Locale locale, Model model,@RequestHeader(value="User-Agent", defaultValue="myBrowser") String userAgent) {
		logger.info("Info!!"+ userAgent);
		
		return "login";
	}
	
	@RequestMapping(value="/userlogin.do", method=RequestMethod.POST)
	public String userLogin(LoginDto dto,@RequestHeader(value="User-Agent", defaultValue="myBrowser") String userAgent) {
		logger.info("Info!!"+ userAgent);
		
		return "login";
	}
	
}
