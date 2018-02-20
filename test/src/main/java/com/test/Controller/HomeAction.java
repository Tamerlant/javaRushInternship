package com.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tamerlan on 19.02.2018.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeAction {
    @RequestMapping("/")
    public String homeAction(
            @RequestParam(value="name", required=false, defaultValue="World") String name,
            Model uiModel
    ) {
        uiModel.addAttribute("name", name);
        return "index";
    }
}