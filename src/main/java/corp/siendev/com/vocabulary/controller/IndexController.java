package corp.siendev.com.vocabulary.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Year;

/**
 * Main page of Vocabulary.
 *
 * @author Golubnichenko Yuriy
 */
@Controller
public class IndexController {

    private static final String VIEW_INDEX = "index";

    private long countWord = 0L;
    private int countLanguage = 0;

    private int currentYear = Year.now().getValue();

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("countWord", countWord);
        model.addAttribute("countLanguage", countLanguage);
        model.addAttribute("currentYear", currentYear);

        return VIEW_INDEX;
    }
}
