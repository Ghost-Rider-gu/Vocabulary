package corp.siendev.com.vocabulary.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Year;

/**
 * Controller for add a new word.
 *
 * @author Golubnichenko Yuriy
 */
@Controller
public class WordController {

    private static final String VIEW_WORD = "word";

    private int currentYear = Year.now().getValue();

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/word")
    public String word(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("currentYear",currentYear);

        return VIEW_WORD;
    }
}
