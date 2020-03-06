package hu.elte.IssueTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IssueController {
    
    @RequestMapping("/")
    public String index() {
        return "main";
    }
    
    @RequestMapping("/issues")
    public String list() {
        return "list";
    }
}
