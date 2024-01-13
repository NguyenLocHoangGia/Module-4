package vn.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/sandwich")
    public String showform(){

        return "list";
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String save(@RequestParam("giavi") String[] giavi,ModelMap modelMap){
        modelMap.addAttribute("giavi",giavi);
        return "success";

    }
}
