package corp.siendev.com.vocabulary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "vocabulary/user")
public class UserController {

    private static final String VIEW_LOGIN = "login";

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName(VIEW_LOGIN);

        return modelAndView;
    }
}
