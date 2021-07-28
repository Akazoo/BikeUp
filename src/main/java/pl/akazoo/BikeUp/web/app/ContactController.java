package pl.akazoo.BikeUp.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/contact")
public class ContactController {

    @GetMapping
    public String contactPage(){
        return "app/contactPage/contact";
    }
}
