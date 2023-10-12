package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("")
    @ResponseBody
    public String renderProgramLang() {
        return
                "<body>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> Skills to learn </h2>" +
                        "<ol>" +
                        "<li>  Java </li>"+
                        "<li>  JavaScript </li>" +
                        "<li>  Python </li>" +
                        "</ol>" +
                        "</form>" +
                        "</body>";
    }


@GetMapping("/form")
@ResponseBody
public String renderForm() {
    return "<html>" +
            "<body" +
            "<form action='submit' method = 'post' model attribute= 'select'>" +
            "<label for = 'name'> Choose your favorite language: </label>" +
            "<select name='cars' id='cars'>" +
            "<option value='Java'>Java</option>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='mercedes'>Mercedes</option>" +
            "<option value='audi'>Audi</option>" +
            "</select>" +
            "</form>" +
            "</body>" +
            "</html>";
}
}

