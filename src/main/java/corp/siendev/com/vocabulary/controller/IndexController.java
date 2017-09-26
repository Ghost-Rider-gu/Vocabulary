package corp.siendev.com.vocabulary.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main page of Vocabulary.
 *
 * @author Golubnichenko Yuriy
 */
@Controller
public class IndexController {

    private static final String VIEW_INDEX = "index";

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("appName", appName);

        return VIEW_INDEX;
    }
}
