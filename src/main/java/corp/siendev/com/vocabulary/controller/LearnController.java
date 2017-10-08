package corp.siendev.com.vocabulary.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Year;

/**
 * Controller for learn words.
 *
 * @author Golubnichenko Yuriy
 */
@Controller
public class LearnController {

    private static final String VIEW_LEARN = "learn";

    private int currentYear = Year.now().getValue();

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/learn")
    public String learn(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("currentYear", currentYear);

        return VIEW_LEARN;
    }
}
