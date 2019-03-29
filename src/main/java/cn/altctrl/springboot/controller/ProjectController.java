package cn.altctrl.springboot.controller;

import cn.altctrl.springboot.mapper.ProjectMapper;
import cn.altctrl.springboot.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectMapper projectMapper;

    @RequestMapping("listProject")
    public String listProject(Model model){
        List<Project> projects = projectMapper.findAll();
        model.addAttribute("projects", projects);
        return "listProject";
    }
}
