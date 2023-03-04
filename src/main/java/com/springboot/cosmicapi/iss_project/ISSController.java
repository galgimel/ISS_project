package com.springboot.cosmicapi.iss_project;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iss_location")
public class ISSController {
    private final ISSService issService;

    public ISSController(ISSService issService) {
        this.issService = issService;
    }

    @GetMapping
    public String showFrontPage() {
        return "/front-page";
    }

    @GetMapping("/now")
    public String showIssLocation(final Model model) {
        model.addAttribute("issLocation", issService.getIssLocation());
        return "/ISS-profile";
    }
}
