package manishgiri.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/processFormThree")
    // Use @RequestParam annotation to fetch form field value
    public String shout(@RequestParam("studentName") String name, Model model) {
        // String name = request.getParameter("studentName");
        String message = "Hey There from v3!!! " + name.toUpperCase();
        model.addAttribute("msg", message);
        return "helloworld";
    }
}
