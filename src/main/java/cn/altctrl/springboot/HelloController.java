package cn.altctrl.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
    @Autowired
    private Student student;

    @RequestMapping("/hello")
    public String hello(Model model) {
        /*return String.join("","Hello Spring Boot!","I'm ",
                student.getName(),",my age is",student.getAge().toString());*/
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
