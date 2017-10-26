package corp.siendev.com.vocabulary.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Year;

/**
 * Login controller.
 *
 * @author Golubnichenko Yuriy
 */
@Controller
public class LoginController {

    private static final String VIEW_LOGIN = "login";

    private int currentYear = Year.now().getValue();

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("currentYear", currentYear);

        return VIEW_LOGIN;
    }
}
