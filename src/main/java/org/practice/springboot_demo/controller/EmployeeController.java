package org.practice.springboot_demo.controller;
import org.practice.springboot_demo.dto.EmployeeDto;
import org.practice.springboot_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class EmployeeController {
    @Autowired
  private  EmployeeService employeeService;
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("employee", new EmployeeDto());
        model.addAttribute("msg","please fill the form");
        return "register";
    }
    @PostMapping("/saveReg")
    public String save( @ModelAttribute  EmployeeDto employeeDto,Model model){
        employeeService.saveData(employeeDto);
        model.addAttribute("employee",new EmployeeDto());
        model.addAttribute("msg","register succesfull");
        return "register";
    }
    @GetMapping("/delete")
    public String delete(Model model){
        employeeService.delete();
        model.addAttribute("msg","delete successful");
        return "info";

    }
}
