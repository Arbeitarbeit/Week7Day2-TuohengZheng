package gitpractice.week7day2tuohengzheng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class defaultController {

    @GetMapping()
    public String getDefault() {
        return "good";
    }
}
