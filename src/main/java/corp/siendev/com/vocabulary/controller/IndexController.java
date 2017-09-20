package corp.siendev.com.vocabulary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Main page of Vocabulary.
 *
 * @author Golubnichenko Yuriy
 */
@Controller
public class IndexController {

    private static final String VIEW_INDEX = "index";

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
