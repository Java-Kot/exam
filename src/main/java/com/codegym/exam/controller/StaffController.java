package com.codegym.exam.controller;

import com.codegym.exam.model.Staff;
import com.codegym.exam.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manager")
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/")
    public ModelAndView showIndex(Pageable pageable) {
        Page<Staff> staff;
        staff = staffService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("staff", staff);
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView showAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        modelAndView.addObject("staff", new Staff());
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView addStaff(@ModelAttribute("staff") Staff staff) {
        staffService.save(staff);
        ModelAndView modelAndView = new ModelAndView("add");
        modelAndView.addObject("staff", new Staff());
        modelAndView.addObject("message", "Add Success !");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Integer id) {
        Staff staff = staffService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("staff", staff);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editNote(@ModelAttribute("staff") Staff staff) {
        staffService.save(staff);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("staff", staff);
        modelAndView.addObject("message", "Edit Success !");
        return modelAndView;
    }

    @GetMapping("/del/{id}")
    public String delStaff(@PathVariable Integer id) {
        staffService.remove(id);
        return "redirect:/manager/";
    }
}
