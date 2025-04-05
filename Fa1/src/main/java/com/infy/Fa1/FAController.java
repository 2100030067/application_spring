package com.infy.Fa1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/annotation")
public class FAController {

    @Autowired
    private FaService faService;

    @GetMapping("/view")
    public String showAnnotationsPage(Model model) {
        List<FaEntity> list = faService.getAllAnnotations();
        model.addAttribute("annotations", list);
        return "annotations"; // annotations.html
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("annotation", new FaEntity());
        return "add-annotation"; // add-annotation.html
    }

    @PostMapping("/save")
    public String saveAnnotation(@ModelAttribute("annotation") FaEntity annotation) {
        faService.saveAnnotation(annotation);
        return "redirect:/annotation/view";
    }
}
