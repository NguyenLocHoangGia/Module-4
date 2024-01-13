package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");

    }

    @GetMapping
    public String showHomePage() {
        return "home";
    }

    @PostMapping("/search")
    public String searchWord(@RequestParam String searchWord, Model model) {
        String result = dictionary.get(searchWord.toLowerCase());
        if (result != null) {
            model.addAttribute("result", result);
        } else {
            model.addAttribute("notFound", true);
        }
        return "result";
    }
}