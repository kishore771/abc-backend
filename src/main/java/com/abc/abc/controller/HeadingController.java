package com.abc.abc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.abc.model.Heading;
import com.abc.abc.service.HeadingService;

@RestController
public class HeadingController {

    @Autowired
    private HeadingService headingService;
    

    @GetMapping("/headings")
    public String getAllHeadings() {
        return headingService.getAllHeadings();
    }

    @PostMapping("/heading")
    public String addHeading(@RequestBody Heading heading) {
        return headingService.addHeading(heading.getHeading());
    }
}