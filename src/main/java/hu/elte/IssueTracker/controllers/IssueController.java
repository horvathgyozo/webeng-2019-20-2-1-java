package hu.elte.IssueTracker.controllers;

import hu.elte.IssueTracker.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IssueController {
    
    @Autowired
    private IssueRepository issueRepository;
    
    @RequestMapping("/")
    public String index() {
        return "main";
    }
    
    @RequestMapping("/issues")
    public String list(Model model) {
        model.addAttribute("title", "Hello");
        return "list";
    }
}
