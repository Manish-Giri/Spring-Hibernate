package manishgiri.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String shout(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        String message = "Yo!!! " + name.toUpperCase();
        model.addAttribute("msg", message);
        return "helloworld";
    }
}
